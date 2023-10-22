import java.util.Scanner;

class SumOfTwo {
    public static int calculateSum(int numOne, int numTwo) { // parameters or formal parameters
        int sum = numOne + numTwo;
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int sum = calculateSum(numOne, numTwo); // arguments or actual parameters
        System.out.println(sum);
        scan.close();
    }
}
