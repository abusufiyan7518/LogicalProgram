package com.interviewquestions;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        next = null;
    }
}

class Stack3 {
    Node3 top;

    void push(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }
}

public class StackNew2 {
    public static void main(String[] args) {
        Stack3 stack = new Stack3();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
