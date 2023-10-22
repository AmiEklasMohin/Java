import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String usersName = scan.nextLine();
        System.out.print("Enter your age : ");
        int usersAge = scan.nextInt();
        System.out.println("Name : " + usersName);
        System.out.println("Age : " + usersAge);
        scan.close();
    }
}