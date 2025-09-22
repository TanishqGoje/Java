import java.util.*;

public class SumOfEleAtEvenIndices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask user for the size of the array
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Read array elements from user
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int s = 0;

		// Sum elements at even indices (0, 2, 4, ...)
		System.out.print("Elements at even indices: ");
		for (int i = 0; i < n; i += 2) {
			s += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Print the sum of elements at even indices
		System.out.println("Sum of elements at even indices: " + s);

		sc.close();
	}
}
