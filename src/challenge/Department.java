package challenge;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    public Department(String name, Employee[] employees) {
        this.name = name;

        if (employees.length > 10) {
            throw new ArrayStoreException("Exceeded number of Employees of Department capacity.");
        }

        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                break;
            }
        }
    }

    public int numberOfEmployees() {
        int employeesInDepartment = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                employeesInDepartment++;
            }
        }

        return employeesInDepartment;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : this.employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public double totalEmployeeSalary() {
        double total = 0.0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public double averageEmployeeSalary() {
        return this.totalEmployeeSalary() / this.numberOfEmployees();
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        Employee[] notNullEmployees = new Employee[this.numberOfEmployees()];

        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                notNullEmployees[i] = this.employees[i];
            }
        }

        return notNullEmployees;
    }

    @Override
    public String toString() {
        return "Department name: " + this.getName() + "\n" + Arrays.toString(this.getEmployees());
    }
}
