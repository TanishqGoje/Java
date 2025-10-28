import java.util.Scanner;

public class SumFrom0Ton {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.printf("Sum of numbers from 0 to %d: %d", n, sum);
        sc.close(); 
    }
}
