import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scan.nextInt();
        System.out.print("Enter B : ");
        int B = scan.nextInt();
        if (A >= B) {
            System.out.println(A + " is the largest");
        } else {
            System.out.println(B + " is the largest");
        }
        scan.close();
    }
}
