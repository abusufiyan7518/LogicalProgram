package com.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using method reference to print each name
        names.forEach(System.out::println);
    }
}
