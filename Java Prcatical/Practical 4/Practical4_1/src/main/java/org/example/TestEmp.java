package org.example;

public class TestEmp {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.setEmpID(1);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        Employee bird = new Employee();
        bird.setEmpID(2);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Graphic Designer");

        System.out.println("Employee Details:");
        System.out.println("ID: " + bogdan.getEmpID() + ", Name: " + bogdan.getEmpName() + ", Designation: " + bogdan.getEmpDesignation());
        System.out.println("ID: " + bird.getEmpID() + ", Name: " + bird.getEmpName() + ", Designation: " + bird.getEmpDesignation());
    }
}

