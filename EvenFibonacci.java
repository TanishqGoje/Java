public class EvenFibonacci {
    public static void main(String[] args) {
        int limit = 100; // Change this limit as needed
        int a = 0, b = 1;
        while (a <= limit) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}