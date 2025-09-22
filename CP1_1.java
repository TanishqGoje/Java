import java.util.Scanner;

public class CP1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
