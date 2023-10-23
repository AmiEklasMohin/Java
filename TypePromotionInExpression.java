public class TypePromotionInExpression {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(b - a); /* promoted to int */
        System.out.println(a);
        System.out.println(b);
        int x = 10;
        float y = 20.25f;
        long z = 25;
        double d = 30.45;
        double total = x + y + z + d; /* promoted to double */
        System.out.println(total);
        byte bt = 5;
        bt = (byte) (bt * 2); /* type casted into byte from int */
        System.out.println(bt);
    }
}
