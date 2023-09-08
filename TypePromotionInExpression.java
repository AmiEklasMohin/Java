public class TypePromotionInExpression {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(b - a);
        System.out.println(a);
        System.out.println(b);
        int x = 10;
        float y = 20.25f;
        long z = 25;
        double d = 30.45;
        double total = x + y + z + d;
        System.out.println(total);
        byte bb = 5;
        bb = (byte) (bb * 2);
        System.out.println(bb);
    }
}