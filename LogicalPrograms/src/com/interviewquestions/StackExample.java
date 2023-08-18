package com.interviewquestions;

class Stack {
    private int maxSize;
    private int top;
    private int[] array;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.array = new int[maxSize];
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push.");
        }
    }

    public int pop() {
        if (top >= 0) {
            return array[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
