public class ForLoopExample {
    public static void main(String[] args) {
        int anIntegerNumber = 29;
        boolean isPrime = true;
        for (int i = 2; i < anIntegerNumber; i++) {
            if (i % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(anIntegerNumber + " is Prime.");
        } else {
            System.out.println(anIntegerNumber + " is not Prime.");
        }
    }
}
