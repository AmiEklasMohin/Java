public class ArithmeticOperators {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("Binary Operators : +   -  *  /  %");
        System.out.println("Addition = A + B = " + (A + B));
        System.out.println("Subtraction = A - B = " + (A - B));
        System.out.println("Multiplication = A * B = " + (A * B));
        System.out.println("Division = A / B = " + (A / B));
        System.out.println("Modulo = A % B = " + (A % B));
        System.out.println("Unary OPerators : ++  --");
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        int b = 87;
        System.out.println(b--);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b);
        int c = 56;
        System.out.println(++c);
        System.out.println(c);
    }
}