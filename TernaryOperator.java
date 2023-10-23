import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter another integer : ");
        int secondNumber = scan.nextInt();
        boolean flag = firstNumber == secondNumber ? true : false;
        if (flag == true) {
            System.out.println("Both are equal.");
        } else {
            int largestNumber = firstNumber  > secondNumber ? firstNumber  : secondNumber;
            System.out.println("Largest number = " + largestNumber);
        }
        scan.close();
    }
}