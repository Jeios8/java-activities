package chapter1;

class Tasksheet113 {
    public static void main (String[] args){
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // Using compound assignment for subtraction (result is now 2)
        System.out.println(result);

        result *= 2; // Using compound assignment for multiplication (result is now 4)
        System.out.println(result);

        result /= 2; // Using compound assignment for division (result is now 2)
        System.out.println(result);

        result += 8; // Using compound assignment for addition (result is now 10)
        result %= 7; // Using compound assignment for modulus (result is now 3)
        System.out.println(result);
    }
}