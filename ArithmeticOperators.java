import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scanner.nextInt();
        System.out.print("Enter B : ");
        int B = scanner.nextInt();
        System.out.println("Addition => A + B = " + (A + B));
        System.out.println("Subtraction => A - B = " + (A - B));
        System.out.println("Multiplication => A * B = " + (A * B));
        System.out.println("Division => A / B = " + (A / B));
        System.out.println("Modulo => A % B = " + (A % B));
        System.out.println("A++ = " + (A++));
        System.out.println("A = " + A);
        System.out.println("++B = " + (++B));
        System.out.println("B = " + B);
        System.out.println("A-- = " + (A--));
        System.out.println("A = " + A);
        System.out.println("--B = " + (--B));
        System.out.println("B = " + B);
        scanner.close();
    }
}
