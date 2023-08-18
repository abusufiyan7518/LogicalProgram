package com.interviewquestions;

public class BubbleSort {
    public static void bubbleSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Charlie", "Bob", "Eve"};
        bubbleSort(names);

        System.out.print("Sorted names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}

