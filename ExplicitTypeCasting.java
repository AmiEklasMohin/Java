public class ExplicitTypeCasting {
    public static void main(String[] args) {
        float floatingPointNumber = 354.3957f;
        System.out.println("Floating Point Number : " + floatingPointNumber);
        int integerNumber = (int) floatingPointNumber;
        System.out.println("Integer Number : " + integerNumber);
        long longTypeVariable = 394563496743957L;
        System.out.println("Long value : " + longTypeVariable);
        int integerTypeVariable = (int) longTypeVariable;
        System.out.println("Long value after TypeCasting into Integer : " + integerTypeVariable);
    }
}
