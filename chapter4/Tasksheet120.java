package chapter4;

import java.util.Scanner;

/**
 * The Tasksheet120 class provides functionality to compute the cumulative sum
 * of given integers and their total sum.
 */

public class Tasksheet120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces or commas:");
        String input = scanner.nextLine();
        scanner.close();

        try {
            // Parse input into an array of integers (handles spaces or commas)
            String[] inputs = input.trim().split("[,\\s]+");
            int[] numbers = new int[inputs.length];
            for (int i = 0; i < inputs.length; i++) {
                numbers[i] = Integer.parseInt(inputs[i]);
            }

            // Print given parameters
            System.out.print("Given Parameters: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Compute total sum using cumulative sums
            int totalSum = getTotalOfCumulativeSum(numbers);
            System.out.println("Total Sum of Cumulative Sums: " + totalSum);

            // Compute the sum of the given parameters
            int givenSum = 0;
            for (int number : numbers) {
                givenSum += number;
            }
            System.out.println("Sum of Given Parameters: " + givenSum);
            
            totalSum += givenSum;
            System.out.println("Total Sum of Cumulative Sums and Given Parameters: " + totalSum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integers only.");
        }
    }

    /**
     * Computes the sum of all parameters and their cumulative sums.
     */
    public static int getTotalOfCumulativeSum(int... numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            int cumulativeSum = getCumulativSum(num);
            System.out.println(num + " -> Cumulative sum: " + cumulativeSum);
            totalSum += cumulativeSum;
        }
        return totalSum;
    }

    /**
     * Computes the cumulative sum of integers from 1 to the specified number.
     * Formula Source: https://www.mathisfunforum.com/viewtopic.php?id=25783
     */
    private static int getCumulativSum(int number) {
        return number * (number + 1) / 2;
    }
}