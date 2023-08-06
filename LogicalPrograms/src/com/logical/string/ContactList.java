package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("Contact List");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.add(new Contact(name, phoneNumber));
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    viewAllContacts(contacts);
                    break;
                case 3:
                    searchContact(contacts, scanner);
                    break;
                case 4:
                    deleteContact(contacts, scanner);
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

    public static void viewAllContacts(ArrayList<Contact> contacts) {
        System.out.println("All Contacts:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.name);
            System.out.println("Phone Number: " + contact.phoneNumber);
            System.out.println();
        }
    }

    public static void searchContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter contact name to search: ");
        String nameToSearch = scanner.nextLine();

        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(nameToSearch)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + contact.name);
                System.out.println("Phone Number: " + contact.phoneNumber);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact '" + nameToSearch + "' not found.");
        }
    }

    public static void deleteContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter contact name to delete: ");
        String nameToDelete = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(nameToDelete)) {
                contacts.remove(contact);
                System.out.println("Contact '" + contact.name + "' deleted.");
                return;
            }
        }

        System.out.println("Contact '" + nameToDelete + "' not found.");
    }
}
