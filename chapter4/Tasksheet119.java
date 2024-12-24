package chapter4;

import java.util.Scanner;

/**
 * This Tasksheet119 class provides methods to perform basic arithmetic operations
 * (addition, subtraction, multiplication, and division) on two input numbers and prints
 * the results.
 */

public class Tasksheet119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double a = getValidNumber(scanner, "Enter your first number: ");
        double b = getValidNumber(scanner, "Enter your second number: ");

        // Perform operations and print results
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        scanner.close();
    }

    // Makes sure that the user only inputs valid numbers
    public static double getValidNumber(Scanner scanner, String msg) {
        while (true) {
            System.out.print(msg);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid Input. I can only read valid numbers for now ^^,");
                scanner.next();
            }
        }
    }

    // Adds two numbers.
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtracts two numbers.
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers.
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Divides two numbers.
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}
