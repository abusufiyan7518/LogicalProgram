package com.interviewquestions;

class CircularQueue {
    private int maxSize;
    private int[] array;
    private int front;
    private int rear;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int value) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % maxSize;
        }

        array[rear] = value;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int value = array[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }

        return value;
    }
}

public class CircularQueueExample {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
