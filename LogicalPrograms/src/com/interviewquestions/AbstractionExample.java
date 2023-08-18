package com.interviewquestions;

abstract class ShapeNew {
    abstract double calculateArea();
}

class CircleNew extends ShapeNew {
    private double radius;

    public CircleNew(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        CircleNew circle = new CircleNew(5.0);
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
