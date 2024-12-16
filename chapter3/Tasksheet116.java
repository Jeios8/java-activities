package chapter3;

/**
 * This Tasksheet116 class implements a program that checks 
 * if a given input string is a palindrome. A palindrome is a sequence 
 * of characters that reads the same forward and backward.
 */

import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();
        
        // Use StringBuilder to create the reverse of the input string
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        
        // Check if the original string is equal to the reversed string
        if (inputString.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}