package org.example;

public class TestEmp {
    public static void main(String[] args) {
        Employee employee = new Employee("Kevin Anjalo", 22, 100000.0);

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee salary: " + employee.getSalary());

        employee.setName("Brian Shamal");
        employee.setAge(18);
        employee.setSalary(180000.0);

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee salary: " + employee.getSalary());
    }
}
