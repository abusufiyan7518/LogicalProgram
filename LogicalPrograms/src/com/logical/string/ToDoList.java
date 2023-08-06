package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("To-Do List");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addTask(tasks, scanner);
                    break;
                case 2:
                    markCompleted(tasks, scanner);
                    break;
                case 3:
                    viewTasks(tasks);
                    break;
                case 4:
                    removeTask(tasks, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addTask(ArrayList<Task> tasks, Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added to the list.");
    }

    public static void markCompleted(ArrayList<Task> tasks, Scanner scanner) {
        System.out.print("Enter the index of the task to mark as completed: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.isCompleted = true;
            System.out.println("Task marked as completed: " + task.description);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public static void viewTasks(ArrayList<Task> tasks) {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + (task.isCompleted ? "[X] " : "[ ] ") + task.description);
        }
    }

    public static void removeTask(ArrayList<Task> tasks, Scanner scanner) {
        System.out.print("Enter the index of the task to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask.description);
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
