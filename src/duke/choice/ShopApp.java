package duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        double tax = 0.2, total;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();

        c1.name = "Pinky";

        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();

        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("Clothing item 1 description: " + item1.description + ", price: " + item1.price + ", size: " + item1.size);

        System.out.println("Clothing item 2 description: " + item2.description + ", price: " + item2.price + ", size: " + item2.size);

        total = (item2.price * 2) + item1.price;
        total += total * tax;

        System.out.println("The total amount the customer needs to pay for two T-Shirts and one Jacket is: " + total);

    }
}
