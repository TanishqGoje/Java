import java.util.Scanner;

public class NumberRange {
    public static void main() {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check if the number is even and less than or equal to 100
        if (num % 2 == 0 && num <= 100) {
            // Check which range the number falls into and perform the corresponding operation
            if (num >= 1 && num <= 25) {
                // If number is between 1 and 25 (inclusive), print double the number
                System.out.println(num * 2);
            } else if (num >= 26 && num <= 50) {
                // If number is between 26 and 50 (inclusive), print half the number
                System.out.println(num / 2);
            } else if (num >= 51 && num <= 75) {
                // If number is between 51 and 75 (inclusive), print double the number
                System.out.println(num * 2);
            } else if (num >= 76 && num <= 100) {
                // If number is between 76 and 100 (inclusive), print half the number
                System.out.println(num / 2);
            }
        } 
        // Check if the number is odd and less than or equal to 100
        else if (num % 2 != 0 && num <= 100) {
            // Check which range the number falls into and perform the corresponding operation
            if (num >= 1 && num <= 25) {
                // If number is between 1 and 25 (inclusive), print double the number
                System.out.println(num * 2);
            } else if (num >= 26 && num <= 50) {
                // If number is between 26 and 50 (inclusive), print half the number
                System.out.println(num / 2);
            } else if (num >= 51 && num <= 75) {
                // If number is between 51 and 75 (inclusive), print double the number
                System.out.println(num * 2);
            } else if (num >= 76 && num <= 100) {
                // If number is between 76 and 100 (inclusive), print half the number
                System.out.println(num / 2);
            }
        } 
        // If the number is greater than 100
        else {
            // Print the number plus 1000
            System.out.println(num + 1000);
        }

        // Close the Scanner object to free resources
        sc.close();
    }
}