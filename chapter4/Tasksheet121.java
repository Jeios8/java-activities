package chapter4;

import static java.lang.Math.*;

/**
 * The Tasksheet121 class provides methods for performing basic arithmetic operations
 * (addition, subtraction, multiplication, and division) using static imports from
 * the Math class.
 */

public class Tasksheet121 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;

        // Perform math operations
        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);

        // Display results
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }

    /**
     * Adds two integers using Math.addExact().
     */
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    /**
     * Subtracts two integers using Math.subtractExact().
     */
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    /**
     * Multiplies two integers using Math.multiplyExact().
     */
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    /**
     * Divides two integers using Math.floorDiv().
     */
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }
}