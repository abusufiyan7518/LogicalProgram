package com.interviewquestions;

public class OuterClass {
    static class NestedStaticClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
        NestedStaticClass nested = new NestedStaticClass();
        nested.display();
    }
}
