import java.util.*;

public class NumOfEleLessThanEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Declare arrays
        int[] arr = new int[n];   // Original array
        int[] arr1 = new int[n];  // Array to store counts

        // Input array elements
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // For each element, count how many elements are less than it
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            arr1[i] = count; // Store count in arr1
        }

        // Output the result array
        System.out.print("New Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        sc.close();
    }
}