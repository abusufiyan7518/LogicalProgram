package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem {
    String name;
    int quantity;

    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<InventoryItem> inventory = new ArrayList<>();

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Update Quantity");
            System.out.println("4. Remove Item");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.add(new InventoryItem(name, quantity));
                    System.out.println("Item added to inventory.");
                    break;
                case 2:
                    viewInventory(inventory);
                    break;
                case 3:
                    updateQuantity(inventory, scanner);
                    break;
                case 4:
                    removeItem(inventory, scanner);
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

    public static void viewInventory(ArrayList<InventoryItem> inventory) {
        System.out.println("Inventory:");
        for (InventoryItem item : inventory) {
            System.out.println("Item: " + item.name);
            System.out.println("Quantity: " + item.quantity);
            System.out.println();
        }
    }

    public static void updateQuantity(ArrayList<InventoryItem> inventory, Scanner scanner) {
        System.out.print("Enter item name to update quantity: ");
        String itemNameToUpdate = scanner.nextLine();

        for (InventoryItem item : inventory) {
            if (item.name.equalsIgnoreCase(itemNameToUpdate)) {
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                item.quantity = newQuantity;
                System.out.println("Quantity updated for item '" + item.name + "'.");
                return;
            }
        }

        System.out.println("Item '" + itemNameToUpdate + "' not found in the inventory.");
    }

    public static void removeItem(ArrayList<InventoryItem> inventory, Scanner scanner) {
        System.out.print("Enter item name to remove: ");
        String itemNameToRemove = scanner.nextLine();

        for (InventoryItem item : inventory) {
            if (item.name.equalsIgnoreCase(itemNameToRemove)) {
                inventory.remove(item);
                System.out.println("Item '" + item.name + "' removed from inventory.");
                return;
            }
        }

        System.out.println("Item '" + itemNameToRemove + "' not found in the inventory.");
    }
}
