package chapter4;

import java.util.Scanner;

/**
 * This Tasksheet117 class determines the largest number among three user-provided integers. 
 * If all three numbers are equal, it outputs a message indicating equality.
 * Otherwise, it identifies and displays the largest number.
 * 
 * Article reference for using Scanner to read integer: 
 * https://www.geeksforgeeks.org/how-to-read-and-print-an-integer-value-in-java/
 */

public class Tasksheet117 {
    public static void main(String[] args) {
        // Input three integers
        Scanner scanner = new Scanner(System.in);
        int a = getValidInteger(scanner, "Enter your first number: ");
        int b = getValidInteger(scanner, "Enter your second number: ");
        int c = getValidInteger(scanner, "Enter your third number: ");

        System.out.println("You entered: " + a + ", " + b + ", and " + c + ".");

        // Check if all numbers are equal
        if (a == b && b == c) {
            System.out.println("As checked, all numbers are equal");
        } else {
            // Find the largest number
            int largest = largestNum(a, b, c);
            System.out.println("As checked, " + largest + " is the largest.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // A method that that makes sure that the user only inputs valid integers
    public static int getValidInteger(Scanner scanner, String msg) {
        while (true) {
            System.out.print(msg);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid Input. I can only read valid Integer for now ^^,");
                scanner.next();
            }
        }
    }

    // compares numbers and returns the largest
    public static int largestNum(int a, int b, int c) {
        return ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
    }
}