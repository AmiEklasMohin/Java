import java.util.Scanner;

public class PrimeNumbersInGivenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();
        int temp = firstNumber, primeCounter = 0;
        do {
            boolean flag = true; 
            if (temp == 1) {
                flag = false;
            } else {
                int i = 2;
                while (i <= (temp / 2)) {
                    if (temp % i == 0) {
                        flag = false;
                        break;
                    }
                    i += 1;
                }
            }
            if (flag == true) {
                primeCounter += 1;
                System.out.print(temp + " ");
            }
            temp += 1;
        } while (temp <= secondNumber);

        System.out.println("\nNumber of primes between " + firstNumber + " and " + secondNumber + " is = " + primeCounter);
        scanner.close();
    }
}
