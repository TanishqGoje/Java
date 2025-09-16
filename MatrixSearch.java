import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns:");
        int n = sc.nextInt(), m = sc.nextInt(), flag = 0, x;
        int a[][] = new int[n][m];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.print("Enter element to be searched: ");
        x = sc.nextInt();
        outer: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == x) {
                    flag = 1;
                    System.out.printf("Element found at (%d, %d)", i + 1, j + 1);
                    break outer;
                }
            }
        }
        if (flag == 0)
            System.out.print("Element not found");
        sc.close();
    }
}
