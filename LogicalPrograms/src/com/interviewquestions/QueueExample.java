package com.interviewquestions;

class NodeNew {
    int data;
    NodeNew next;

    NodeNew(int data) {
        this.data = data;
        next = null;
    }
}

class Queue {
    private NodeNew front;
    private NodeNew rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(int value) {
        NodeNew newNode = new NodeNew(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return value;
        }
    }
}

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}

