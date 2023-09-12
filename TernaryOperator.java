import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter another integer : ");
        int secondNumber = scanner.nextInt();
        boolean flag = firstNumber == secondNumber ? true : false;
        if (flag == true) {
            System.out.println("Both are equal.");
        } else {
            int largestNumber = firstNumber  > secondNumber ? firstNumber  : secondNumber;
            System.out.println("Largest number = " + largestNumber);
        }
        scanner.close();
    }
}
