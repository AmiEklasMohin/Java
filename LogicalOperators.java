public class LogicalOperators{
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println(a > 2 && b > a);
        System.out.println(a > 2 && b < a);
        System.out.println(a < 2 && b < a);
        System.out.println(a > 2 || b > a);
        System.out.println(a > 2 || b < a);
        System.out.println(a < 2 || b < a);
        System.out.println(!(a > b));
        System.out.println(!(a < b));
        System.out.println(!(a == b));
    }
}
