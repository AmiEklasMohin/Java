import java.util.Scanner;

class SumOfTwo {
    public static int calculateSum(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int sum = calculateSum(numOne, numTwo);
        System.out.println(sum);
        scan.close();
    }
}
