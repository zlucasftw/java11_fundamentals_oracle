package duke.choice;

public class Clothing {

    public final double MINIMUM_PRICE = 10;
    public final double TAX_RATE = 0.2;

    private String description;
    private double price;
    private String size = "M";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (this.TAX_RATE + 1);
    }

    public void setPrice(double price) {
        if (price >= this.MINIMUM_PRICE) {
            this.price = price;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
