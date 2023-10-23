import java.util.Scanner;

public class ClassificationByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You are an Adult.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a Teenager.");
        } else {
            System.out.println("You are a Child.");
        }
        scan.close();
    }
}