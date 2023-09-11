import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String usersName = scanner.nextLine();
        System.out.print("Enter your age : ");
        int usersAge = scanner.nextInt();
        System.out.println("Name : " + usersName);
        System.out.println("Age : " + usersAge);
        scanner.close();
    }
}