package com.logical.string;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Random Password Generator");

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include digits? (y/n): ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("y");

        String password = generateRandomPassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecialChars);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generateRandomPassword(int length, boolean includeUppercase, boolean includeLowercase,
                                                boolean includeDigits, boolean includeSpecialChars) {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";

        String allChars = "";
        if (includeUppercase) {
            allChars += uppercaseChars;
        }
        if (includeLowercase) {
            allChars += lowercaseChars;
        }
        if (includeDigits) {
            allChars += digitChars;
        }
        if (includeSpecialChars) {
            allChars += specialChars;
        }

        if (allChars.isEmpty()) {
            return "Invalid criteria: No character types selected.";
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
