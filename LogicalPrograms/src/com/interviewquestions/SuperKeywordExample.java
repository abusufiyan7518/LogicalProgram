package com.interviewquestions;

class Parent {
    String message = "Hello from parent class";
}

class Child extends Parent {
    String message = "Hello from child class";

    void displayMessage() {
        System.out.println(super.message); // Refers to the parent's message
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();
    }
}
