public class OperatorsInJava {
    public static void main(String[] args) {
        System.out.println("There are Five Types of Operators in Java : ");
        String[] OperatorsInJava = {"Arithmetic Operators (Binary/Unary)",
                                    "Relational Operators",
                                    "Logical Operators",
                                    "Bitwise Operators",
                                    "Assignment Operators"
                                   };
        for (int i = 0; i < OperatorsInJava.length; i++) {
            System.out.println((i + 1) + ". " + OperatorsInJava[i]);
        }
    }
}