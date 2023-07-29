package org.example;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private double bonus;

    public Employee(String name, int age, double salary, double bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonusAmount() {
        return bonus + salary;
    }

}

