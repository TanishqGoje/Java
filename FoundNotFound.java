import java.util.Scanner;

public class FoundNotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the sorted array: ");
        int n = sc.nextInt();
        System.out.println("Enter the sorted array:");
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to find in the array: ");
        int num = sc.nextInt();
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.print("Found.");
        } else {
            System.out.print("Not Found.");
        }
        
        sc.close();
    }
}
