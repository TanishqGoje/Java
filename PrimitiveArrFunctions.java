import java.util.Scanner;
import java.util.Arrays;

public class PrimitiveArrFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array from the user
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        // Declare the array and input its elements from the user
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the length of the array
        System.out.println("Array length: " + arr.length);

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(arr);
        System.out.print("Sorted Array (Ascending): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Search for the value 5 in the sorted array using Arrays.binarySearch()
        int a = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5 (using binarySearch): " + a);

        // Create a new array and fill it with -1 using Arrays.fill()
        int[] fillarr = new int[n];
        Arrays.fill(fillarr, -1);
        System.out.print("Array filled with -1: ");
        for (int i = 0; i < fillarr.length; i++) {
            System.out.print(fillarr[i] + " ");
        }
        System.out.println();

        // Reverse the sorted array to get descending order (manual reversal)
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.print("Sorted Array (Descending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Demonstrate reference assignment: arr1 points to the same array as arr0
        int[] arr0 = { 3, 7, 9, 10 };
        int[] arr1 = arr0;
        arr1[0] = 100; // Modifying arr1 also modifies arr0, since both reference the same array
        System.out.print("arr0 after reference assignment and modifying arr1: ");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + " ");
        }
        System.out.print("\narr1 after reference assignment and modifying arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Create a true copy of an array using Arrays.copyOf()
        arr0 = new int[] {3, 7, 9, 10};
        arr1 = Arrays.copyOf(arr0, arr0.length); // arr1 is a separate copy
        arr1[0] = 100; // Modifying arr1 does NOT affect arr0
        System.out.print("arr0 after copying and modifying arr1: ");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + " ");
        }
        System.out.print("\narr1 after copying and modifying arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Copy a range of elements from arr0 to arr1 using Arrays.copyOfRange()
        arr1 = Arrays.copyOfRange(arr0, 1, 3); // arr1 contains elements from index 1 to 2
        System.out.print("arr0 after copying range to arr1: ");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + " ");
        }
        System.out.print("\narr1 after Arrays.copyOfRange(arr0, 1, 3): ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

/*
Primitive array functions demonstrated:
- Arrays.sort(arr): Sorts the array in ascending order.
- Arrays.binarySearch(arr, value): Searches for 'value' in the sorted array and returns its index (or a negative value if not found).
- Arrays.fill(arr, value): Fills the entire array with the specified value.
- arr.length: Returns the length of the array.
- Manual reversal: Used to reverse the sorted array for descending order.
- Reference assignment: Shows that assigning one array variable to another makes both refer to the same array.
- Arrays.copyOf(arr, length): Creates a new array that is a copy of the original, so changes to the copy do not affect the original.
- Arrays.copyOfRange(arr, from, to): Copies a range of elements from the original array into a new array.
*/