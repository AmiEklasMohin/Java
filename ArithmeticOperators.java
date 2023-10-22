import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scan.nextInt();
        System.out.print("Enter B : ");
        int B = scan.nextInt();
        System.out.println("Addition => A + B = " + (A + B));
        System.out.println("Subtraction => A - B = " + (A - B));
        System.out.println("Multiplication => A * B = " + (A * B));
        System.out.println("Division => A / B = " + (A / B));
        System.out.println("Modulo => A % B = " + (A % B));
        System.out.println("A++ = " + (A++)); /* post increment */
        System.out.println("A = " + A);
        System.out.println("++B = " + (++B)); /* pre increment */
        System.out.println("B = " + B);
        System.out.println("A-- = " + (A--)); /* post decrement */
        System.out.println("A = " + A);
        System.out.println("--B = " + (--B)); /* pre decrement */
        System.out.println("B = " + B);
        scan.close();
    }
}
