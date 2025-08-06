import java.util.*;
public class SumOfArrayElements {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
