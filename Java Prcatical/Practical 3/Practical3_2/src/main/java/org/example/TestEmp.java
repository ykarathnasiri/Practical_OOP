package org.example;

public class TestEmp {
    public static void main(String[] args) {
        Employee employee = new Employee("Bogdan", 30, 50000, 10000);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Bonus Amount: " + employee.getBonusAmount());
    }
}
