import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float floatingPointNumber = sc.nextFloat();
        int integerNumber = (int) (floatingPointNumber);
        System.out.println(integerNumber);
        long longTypeVariable = sc.nextLong();
        int integerTypeVariable = (int)longTypeVariable;
        System.out.println(integerTypeVariable);
        sc.close();
    }
}
