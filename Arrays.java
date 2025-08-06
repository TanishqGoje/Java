import java.util.*; // Imports all classes from the java.util package (for Scanner)

// Define a public class named Arrays
public class Arrays {
    // Main method (entry point of the program)
    public static void main() {
        // Always mention size in java

        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        int n = sc.nextInt(); // Read an integer from the user, which represents the size of the array

        int[] arr = new int[n]; // Declare and initialize an integer array of size n

        for (int i = 0; i < n; i++) { // Loop from 0 to n-1 to fill the array
            arr[i] = sc.nextInt(); // Read an integer from the user and store it in the array at index i
        }
        for (int i : arr) {
            System.out.println(i + "r da nomburz ");
        }

        sc.close(); // Close the Scanner to free resources
    }
}