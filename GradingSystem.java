import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int n = sc.nextInt();

        if (n <= 100 && n >= 91) {
            System.out.println("Grade: O");
        } else if (n <= 90 && n >= 81) {
            System.out.println("Grade: A");
        } else if (n <= 80 && n >= 71) {
            System.out.println("Grade: B");
        } else if (n <= 70 && n >= 61) {
            System.out.println("Grade: C");
        } else if (n <= 60 && n >= 51) {
            System.out.println("Grade: D");
        } else if (n <= 50 && n >= 36) {
            System.out.println("Grade: D");
        } else if(n <= 36 && n >= 0){
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Enter valid marks");
        }
        sc.close();
    }
}