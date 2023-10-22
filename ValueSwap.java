import java.util.Scanner;

class ValueSwap {
    public static void valuesExchange (int numOne, int numTwo) {
        int temp = numOne;
        numOne = numTwo;
        numTwo = temp;
        System.out.println("numOne = " + numOne); /* numOne = 88 */
        System.out.println("numTwo = " + numTwo); /* numTwo = 45 */
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = 45;
        int numTwo = 88;
        valuesExchange(numOne, numTwo); /* call by value */
        System.out.println("numOne = " + numOne); /* numOne = 45 */
        System.out.println("numTwo = " + numTwo); /* numTwo = 88 */
        scan.close();
    }
}
