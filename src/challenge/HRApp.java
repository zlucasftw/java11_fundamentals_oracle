package challenge;

public class HRApp {
    public static void main(String[] args) {
        // System.out.println("Welcome to Duke HRApp");
        System.out.println("HR App Starts");

        Department department = new Department("Department Education");
        System.out.println(department.toString());

        Employee employee_01 = new Employee(1, "Duke Employee 01", 2000.1);
        Employee employee_02 = new Employee(2, "Duke Employee 02", 3000.2);
        Employee employee_03 = new Employee(3, "Duke Employee 03", 1000.3);
        Employee employee_04 = new Employee(4, "Duke Employee 04", 2500.4);

        department.addEmployee(employee_01);
        department.addEmployee(employee_02);
        department.addEmployee(employee_03);
        department.addEmployee(employee_04);

        System.out.println(department.getEmployeeById(1).toString());

        for (Employee employee : department.getEmployees()) {
            System.out.println(employee.toString());
        }

        System.out.println("Total salary of the department: $" + department.totalEmployeeSalary());
        System.out.println("Average salary of the department: $" + department.averageEmployeeSalary());

        // Employee[] employees = {employee_01, employee_02, employee_03, employee_04};

        // for (Employee employee : employees) {
        //    System.out.println(employee);
        // }

        // Department department = new Department("Duke Department", employees);
    }
}
