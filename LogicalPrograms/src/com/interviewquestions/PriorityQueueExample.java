package com.interviewquestions;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);

        System.out.print("Priority queue elements: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
