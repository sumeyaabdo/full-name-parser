package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split the full name into parts
        String[] nameParts = fullName.split("\\s+");

        // Get the first name
        String firstName = nameParts[0];

        // Get the middle and last name
        String middleName = "(none)";
        String lastName;

        if (nameParts.length == 3) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            lastName = nameParts[1];
        }

        // Display the results
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
