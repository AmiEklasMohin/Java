import java.util.Scanner;

public class TypePromotionInExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = 'a';
        char b = 'b';
        System.out.println((int)b);
        System.out.println((int)a);
        System.out.println(b - a);
        System.out.println(a);
        System.out.println(b);
        short s = 5;
        byte bt = 25;
        char ch = 'c';
        byte add = (byte) (s + bt + ch);
        System.out.println(add);
        int x = 10;
        float y = 20.25f;
        long z = 25;
        double d = 30.45;
        double total = x + y + z + d;
        System.out.println(total);
        byte bb = 5;
        bb = (byte) (bb * 2);
        System.out.println(bb);
        sc.close();
    }
}