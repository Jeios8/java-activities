package chapter3;

/**
 * The TaskSheet115 class demonstrates the modification of variables
 * to resolve conditional statements as true. It highlights the
 * use of Java string comparison methods (== and .equals()) and
 * the manipulation of variable assignments to meet specified conditions.
 */

public class Tasksheet115 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = a;
        String c = new String("Wow!");
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}