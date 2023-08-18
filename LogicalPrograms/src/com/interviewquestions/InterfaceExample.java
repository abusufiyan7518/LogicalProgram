package com.interviewquestions;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
