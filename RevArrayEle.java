import java.util.*;

public class RevArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Reversed Array Elements: ");
        for (int i = n - 1; i > 0; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
