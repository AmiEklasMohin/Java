public class OperatorsInJava {
    public static void main(String[] args) {
        System.out.println("There are Five Types of Operators in Java : ");
        String[] OperatorTypes = {"Arithmetic Operators (Binary/Unary)",
                                   "Relational Operators",
                                   "Logical Operators",
                                   "Bitwise Operators",
                                   "Assignment Operators"};
        for (int i = 0; i < OperatorTypes.length; i++) {
            System.out.println((i + 1) + ". " + OperatorTypes[i]);
        }
    }
}