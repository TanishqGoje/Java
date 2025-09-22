import java.util.*;

public class SumofArrminusSumofEvenNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int evensum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evensum += arr[i];
            }
        }
        System.out.print(sum - evensum);
        sc.close();
    }

}