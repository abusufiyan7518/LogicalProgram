package com.interviewquestions;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person person = new Person("Sufiyan");
        person.introduce();
    }
}

