import java.util.Scanner;

public class LargestEvenArrayEle {
    public static void main() {

        int largest = 0;
        Scanner sc = new Scanner(System.in);

        //Prompting user to enter size of array
        System.out.print("Enter number of elements in the array: ");

        //Scanning the entered size
        int n = sc.nextInt();

        //Prompting user to enter array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");

        //Scanning the entered elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Assigning largest array elements to "largest" variable
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            
        }

        //Printing Largest Array Element
        System.out.println("Largest Element: " + largest);

        //Closing the object
        sc.close();
    }
}
