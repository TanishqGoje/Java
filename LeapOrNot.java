import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If divisible by 4, check if it is also divisible by 100
            if (year % 100 == 0) {
                // If divisible by 100, check if it is also divisible by 400
                if (year % 400 == 0) {
                    // Divisible by 400: leap year
                    System.out.println(year + " is a Leap Year");
                } else {
                    // Divisible by 100 but not by 400: not a leap year
                    System.out.println(year + " is not a Leap Year");
                }
            } else {
                // Divisible by 4 but not by 100: leap year
                System.out.println(year + " is a Leap Year");
            }
        } else {
            // Not divisible by 4: not a leap year
            System.out.println(year + " is not a Leap Year");
        }

        // Close the scanner
        sc.close();
    }
}