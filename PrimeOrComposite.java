import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int anIntegerNumber = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (anIntegerNumber / 2); i++) {
            if (anIntegerNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (anIntegerNumber == 1) {
            System.out.println("The number " + anIntegerNumber + " is neither prime nor composite");
        } else if (isPrime) {
            System.out.println("The number " + anIntegerNumber + " is prime");
        } else {
            System.out.println("The number " + anIntegerNumber + " is composite");
        }
        scan.close();
    }
}
