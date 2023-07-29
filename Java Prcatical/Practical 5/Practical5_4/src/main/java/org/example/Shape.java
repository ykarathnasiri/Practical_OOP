package org.example;

abstract class Shape {
    abstract double calculateArea();
    void display() {
        System.out.println("Shape details:");
        System.out.println("Area: " + calculateArea());

    }
}