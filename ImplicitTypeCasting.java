public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int a = 657;
        long b = a; /* Automatically type casted into long */
        System.out.println(b);
        char ch = 'a';
        int numericValue = ch; /* ASCII value of 'a' */
        System.out.println(numericValue); 
    }
}
