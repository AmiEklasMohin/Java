import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
    /*  Relational operators take two operands
        compare their values
        and return a Boolean value (true or false)  */
        Scanner scan = new Scanner(System.in);
        System.out.print("A = ");
        int A = scan.nextInt();
        System.out.print("B = ");
        int B = scan.nextInt();
        System.out.println("A is equal to B -> " + (A == B));
        System.out.println("A is not equal to B -> " + (A != B));
        System.out.println("A is greater than B -> " + (A > B));
        System.out.println("A is less than B -> " + (A < B));
        System.out.println("A is greater than equal to B -> " + (A >= B));
        System.out.println("A is less than equal to B -> " + (A <= B));
        scan.close();
    }
}
