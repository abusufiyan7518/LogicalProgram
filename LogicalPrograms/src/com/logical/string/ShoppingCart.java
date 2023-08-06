package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String name;
    double price;

    public CartItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("Shopping Cart");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double itemPrice = scanner.nextDouble();
                    cart.add(new CartItem(itemName, itemPrice));
                    System.out.println("Item added to cart.");
                    break;
                case 2:
                    removeItem(cart, scanner);
                    break;
                case 3:
                    viewCart(cart);
                    break;
                case 4:
                    calculateTotal(cart);
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

    public static void removeItem(ArrayList<CartItem> cart, Scanner scanner) {
        System.out.print("Enter item name to remove: ");
        String itemNameToRemove = scanner.nextLine();

        for (CartItem item : cart) {
            if (item.name.equalsIgnoreCase(itemNameToRemove)) {
                cart.remove(item);
                System.out.println("Item '" + item.name + "' removed from cart.");
                return;
            }
        }

        System.out.println("Item '" + itemNameToRemove + "' not found in the cart.");
    }

    public static void viewCart(ArrayList<CartItem> cart) {
        System.out.println("Shopping Cart:");
        for (CartItem item : cart) {
            System.out.println("Item: " + item.name);
            System.out.println("Price: $" + item.price);
            System.out.println();
        }
    }

    public static void calculateTotal(ArrayList<CartItem> cart) {
        double total = 0;
        for (CartItem item : cart) {
            total += item.price;
        }
        System.out.println("Total cost of items in cart: $" + total);
    }
}
