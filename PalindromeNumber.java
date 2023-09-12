import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        long inputNumber = scanner.nextLong();
        long reversedNumber = 0;
        long temp = inputNumber;
        while (temp != 0) {
            reversedNumber = (temp % 10) + (reversedNumber * 10);
            temp /= 10;
        }
        if (reversedNumber == inputNumber) {
            System.out.println("The number " + inputNumber + " is a palindrome.");
        } else {
            System.out.println("The number " + inputNumber + " is not a palindrome.");
        }
        scanner.close();
    }
}