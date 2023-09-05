import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = a;
        System.out.println(b);
        char ch = 'a';
        int asciiCode = ch;
        System.out.println(asciiCode);
        sc.close();
    }
}
