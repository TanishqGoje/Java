import java.util.*;

public class EleAreSumOfArrEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            res[i] = arr[i] + arr[n - 1 - i];
            res[n - 1 - i] = arr[i] + arr[n - 1 - i];
        }
        if (n % 2 != 0) {
            res[n / 2] = arr[n / 2];
        }
        System.out.print("Resulting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}