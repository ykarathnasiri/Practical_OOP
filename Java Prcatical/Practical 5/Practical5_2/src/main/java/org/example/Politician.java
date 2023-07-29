package org.example;

public class Politician implements Speaker {
    @Override
    public void speak() {
        System.out.println("Politician is speaking.");
    }
}