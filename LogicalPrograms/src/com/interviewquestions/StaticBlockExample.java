package com.interviewquestions;

public class StaticBlockExample {
    static {
        System.out.println("This is a static block.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
