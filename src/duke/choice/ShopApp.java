package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *  Created in practice 2
 *
 *  @author Oracle
 */
public class ShopApp {
    /**
     * @params args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!"); // practice 2

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");            // practice 6.2
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");         // practice 6.2
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");             // practice 6.2
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");           // practice 6.2

        Clothing[] items = {item1, item2, item3, item4};

        try {                                                                                     // demo 9
            ItemList list = new ItemList(items);                                                  // demo 9
            Routing routing = Routing.builder()                                                   // demo 9
                    .get("/items", list).build();
            // demo 9
            ServerConfiguration config = ServerConfiguration.builder()                            // demo 9
                    .bindAddress(InetAddress.getLocalHost())                                      // demo 9
                    .port(8888).build();
            // demo 9
            WebServer ws = WebServer.create(config, routing);
            // demo 9
            ws.start();
            []// demo 9
        } catch (UnknownHostException exception) {                                                // demo 9
            exception.printStackTrace();                                                          // demo 9
        }                                                                                         // demo 9

    }
}
