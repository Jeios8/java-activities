package chapter2;

/**
 * The Tasksheet114 class implements an application that
 * determines whether numbers are odd or even using a loop 
 * and prints the result to standard output.
 */

public class Tasksheet114 {
    public static void main(String[] args) {

        int check_number = 10; // Initial value of 10
        String message;

        for (int i = 1; i <= check_number; i++) {
            // Check if the number is odd or even
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            // Print the message
            System.out.println(message);
        }
    }
}
