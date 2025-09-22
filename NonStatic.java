import java.util.*;

public class NonStatic {
    void qwer(int x) {
        x++;
        if (x % 2 == 0)
            System.out.print("Odd");
        else
            System.out.print("Even");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // NonStatic ns = new NonStatic();
        sc.close();
        
    }

}
