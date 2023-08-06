package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double[] grades;

    public Student(String name, int rollNumber, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Student Record System");
            System.out.println("1. Add Student Record");
            System.out.println("2. View Student Details");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. Display Summary");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudentRecord(students, scanner);
                    break;
                case 2:
                    viewStudentDetails(students, scanner);
                    break;
                case 3:
                    calculateAverageGrade(students, scanner);
                    break;
                case 4:
                    displaySummary(students);
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

    public static void addStudentRecord(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter number of grades: ");
        int numGrades = scanner.nextInt();
        double[] grades = new double[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        students.add(new Student(name, rollNumber, grades));
        System.out.println("Student record added.");
    }

    public static void viewStudentDetails(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter roll number to view details: ");
        int rollNumber = scanner.nextInt();

        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.println("Student Details:");
                System.out.println("Name: " + student.name);
                System.out.println("Roll Number: " + student.rollNumber);
                System.out.println("Grades:");
                for (int i = 0; i < student.grades.length; i++) {
                    System.out.println("Grade " + (i + 1) + ": " + student.grades[i]);
                }
                return;
            }
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public static void calculateAverageGrade(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter roll number to calculate average grade: ");
        int rollNumber = scanner.nextInt();

        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                double averageGrade = student.calculateAverageGrade();
                System.out.println("Average Grade for Student " + student.name + ": " + averageGrade);
                return;
            }
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public static void displaySummary(ArrayList<Student> students) {
        System.out.println("Student Summary:");
        for (Student student : students) {
            double averageGrade = student.calculateAverageGrade();
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Average Grade: " + averageGrade);
            System.out.println();
        }
    }
}
