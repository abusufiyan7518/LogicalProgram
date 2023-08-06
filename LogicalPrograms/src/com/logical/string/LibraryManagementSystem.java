package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.add(new Book(title, author));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    borrowBook(library, scanner);
                    break;
                case 3:
                    returnBook(library, scanner);
                    break;
                case 4:
                    viewBooks(library);
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

    public static void borrowBook(ArrayList<Book> library, Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String titleToBorrow = scanner.nextLine();

        for (Book book : library) {
            if (book.title.equalsIgnoreCase(titleToBorrow)) {
                if (!book.isBorrowed) {
                    book.isBorrowed = true;
                    System.out.println("Book '" + book.title + "' borrowed successfully.");
                } else {
                    System.out.println("Book '" + book.title + "' is already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book '" + titleToBorrow + "' not found in the library.");
    }

    public static void returnBook(ArrayList<Book> library, Scanner scanner) {
        System.out.print("Enter book title to return: ");
        String titleToReturn = scanner.nextLine();

        for (Book book : library) {
            if (book.title.equalsIgnoreCase(titleToReturn)) {
                if (book.isBorrowed) {
                    book.isBorrowed = false;
                    System.out.println("Book '" + book.title + "' returned successfully.");
                } else {
                    System.out.println("Book '" + book.title + "' was not borrowed.");
                }
                return;
            }
        }

        System.out.println("Book '" + titleToReturn + "' not found in the library.");
    }

    public static void viewBooks(ArrayList<Book> library) {
        System.out.println("List of Books in the Library:");
        for (Book book : library) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Borrowed: " + (book.isBorrowed ? "Yes" : "No"));
            System.out.println();
        }
    }
}
