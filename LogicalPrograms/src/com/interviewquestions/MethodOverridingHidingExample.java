package com.interviewquestions;

class ParentNew {
    void display() {
        System.out.println("This is the parent class.");
    }
    
    static void show() {
        System.out.println("Static method in parent class.");
    }
}

class ChildNew extends ParentNew {
    @Override
    void display() {
        System.out.println("This is the child class.");
    }

    static void show() {
        System.out.println("Static method in child class.");
    }
}

public class MethodOverridingHidingExample {
    public static void main(String[] args) {
        ParentNew parent = new ChildNew();
        parent.display(); // Method overriding
        parent.show();    // Method hiding
    }
}
