package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person();
        person.setCar("blue");
        System.out.println(person.getCar().getColor());
    }
}