import java.util.Scanner;

class MethodsDemo {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; ++i) {
            printHelloWorld();
        }
        scan.close();
    }
}
