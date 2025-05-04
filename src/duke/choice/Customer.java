package duke.choice;

public class Customer {

    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int size) {

        switch (size) {
            case 1:
            case 2:
            case 3:
                this.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                this.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                this.size = "L";
                break;
            default:
                this.size = "X";
        }

    }
}
