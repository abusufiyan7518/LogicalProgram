package com.interviewquestions;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node reversed = reverse(head);

        System.out.print("Reversed linked list: ");
        while (reversed != null) {
            System.out.print(reversed.data + " ");
            reversed = reversed.next;
        }
    }
}
