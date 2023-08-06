package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = createProducts();

        ArrayList<Product> cart = new ArrayList<>();

        while (true) {
            System.out.println("Online Shopping System");
            System.out.println("1. Browse Products");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    browseProducts(products, cart, scanner);
                    break;
                case 2:
                    viewCart(cart);
                    break;
                case 3:
                    checkout(cart);
                    cart.clear();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static ArrayList<Product> createProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Smartphone", 599.99));
        products.add(new Product("Laptop", 899.99));
        products.add(new Product("Headphones", 129.99));
        products.add(new Product("Smart Watch", 199.99));
        return products;
    }

    public static void browseProducts(ArrayList<Product> products, ArrayList<Product> cart, Scanner scanner) {
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).name + " - $" + products.get(i).price);
        }

        System.out.print("Enter the number of the product you want to add to cart (0 to cancel): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= products.size()) {
            cart.add(products.get(choice - 1));
            System.out.println(products.get(choice - 1).name + " added to cart.");
        } else if (choice != 0) {
            System.out.println("Invalid product number.");
        }
    }

    public static void viewCart(ArrayList<Product> cart) {
        System.out.println("Shopping Cart:");
        double total = 0;
        for (Product product : cart) {
            System.out.println(product.name + " - $" + product.price);
            total += product.price;
        }
        System.out.println("Total: $" + total);
    }

    public static void checkout(ArrayList<Product> cart) {
        System.out.println("Thank you for shopping with us!");
    }
}
