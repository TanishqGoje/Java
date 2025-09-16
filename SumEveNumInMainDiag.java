import java.util.*;

public class SumEveNumInMainDiag {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of matrix:");
        int n = sc.nextInt(), s = 0;
        int a[][] = new int[n][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.println("The sum is:");
        for (int i = 0; i < n; i++) {
            if (a[i][i] % 2 == 0)
                s += a[i][i];
            if (a[i][n - i - 1] % 2 == 0)
                s += a[i][n - i - 1];
        }
        if (n % 2 != 0)
            s -= a[n / 2][n / 2];
        System.out.println(s);
        sc.close();
    }
}