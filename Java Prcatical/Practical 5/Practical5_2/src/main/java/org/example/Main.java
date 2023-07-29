package org.example;

public class Main {
        public static void main(String[] args) {
            Speaker politician = new Politician();
            Speaker priest = new Priest();
            Speaker lecturer = new Lecturer();

            politician.speak();
            priest.speak();
            lecturer.speak();
        }
}

