import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int anIntegerNumber = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (anIntegerNumber / 2); i++) {
            if (anIntegerNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (anIntegerNumber == 1) {
            System.out.println("The number " + anIntegerNumber + " is neither a prime nor a composite.");
        } else if (isPrime == true) {
            System.out.println("The number " + anIntegerNumber + " is prime.");
        } else {
            System.out.println("The number " + anIntegerNumber + " is composite.");
        }
        scanner.close();
    }
}