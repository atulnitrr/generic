package com.atul.generic.generic.service;

public class Person {

    private String name;
    private String lastName;


    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
