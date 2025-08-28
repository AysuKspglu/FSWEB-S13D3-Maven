package org.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", "Doe", 20);
        System.out.println("First name: " + p.getFirstName());
        System.out.println("Is teen? " + p.isTeen());

        Wall w = new Wall(5, 4);
        System.out.println("Wall area: " + w.getArea());
    }
}
