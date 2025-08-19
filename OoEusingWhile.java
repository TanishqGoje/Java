import java.util.*;
public class OoEusingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();
        while(n>0){ // While loops are used when the number of iterations are known
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("E");
            } else {
                System.out.println("O");
            }
            n--;
        }
        sc.close();
    }
}
