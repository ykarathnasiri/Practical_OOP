package org.example;

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle class
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() method for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}
