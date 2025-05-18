package challenge;

public class Employee {

    private int ID;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getID() + " " + getName() + " " + getSalary();
    }
}
