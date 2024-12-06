package chapter1;

/** 
 * The Tasksheet112 class implements an application that
 * simply prints "H3110 w0r1d 2.0 true" to standard output.
 * 
 * Instruction: Create all of the primitives (except long and double) 
 * with different values. Concatenate them into a string and print 
 * it to the screen so it will print: H3110 w0r1d 2.0 true
 */

public class Tasksheet112 {
    public static void main(String[] args) {
        // Declare and initialize primitive types
        char h = 'H';
        char w = 'w';
        int zero = 0;
        short one = 1;
        byte three = 3;
        float twoPointZero = 2.0f;
        boolean isTrue = true;

        // Concatenate into a string
        String output = "" + h + three + one + one + zero + " " + w + zero + "r" + one + "d " + twoPointZero + " " + isTrue;

        // Print the output
        System.out.println(output);
    }
}
