import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = scan.nextInt();
        System.out.print("Enter B : ");
        int B = scan.nextInt();
        System.out.print("Enter C : ");
        int C = scan.nextInt();
        if (A >= B) {
            if (A >= C) {
                System.out.println(A + " is the largest");
            } else {
                System.out.println(C + " is the largest");
            }
        } else if (B >= A) {
            if (B >= C) {
                System.out.println(B + " is the largest");
            } else {
                System.out.println(C + " is the largest");
            }
        } else {
            System.out.println(C + " is the largest");
        }
        scan.close();
    }
}
