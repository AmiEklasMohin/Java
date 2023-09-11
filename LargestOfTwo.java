import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scanner.nextInt();
        System.out.print("Enter B : ");
        int B = scanner.nextInt();
        if (A >= B) {
            System.out.println(A + " is the largest.");
        } else {
            System.out.println(B + " is the largest.");
        }
        scanner.close();
    }
}
