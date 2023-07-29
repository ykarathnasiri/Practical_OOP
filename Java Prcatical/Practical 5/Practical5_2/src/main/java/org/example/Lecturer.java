package org.example;

class Lecturer implements Speaker {
    @Override
    public void speak() {
        System.out.println("Lecturer is speaking.");
    }
}
