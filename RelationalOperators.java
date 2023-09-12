import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        System.out.println("A is equal to B -> " + (A == B));
        System.out.println("A is not equal to B -> " + (A != B));
        System.out.println("A is greater than B -> " + (A > B));
        System.out.println("A is less than B -> " + (A < B));
        System.out.println("A is greater than equal to B -> " + (A >= B));
        System.out.println("A is less than equal to B -> " + (A <= B));
        scanner.close();
    }
}
