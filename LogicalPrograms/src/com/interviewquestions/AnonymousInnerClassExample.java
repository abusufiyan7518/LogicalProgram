package com.interviewquestions;

interface Greeting {
    void greet();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        greeting.greet();
    }
}
