package com.interviewquestions;

class Personold {
    String name;

    Personold(String name) {
        this.name = name; // 'this' refers to the current instance of the class
    }

    void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Personold person = new Personold("Alice");
        person.introduce();
    }
}
