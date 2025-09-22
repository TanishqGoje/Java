import java.util.Scanner;

public class IndexToEleOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns:");
        int n = sc.nextInt(), m = sc.nextInt(), count = 0, t;
        int a[][] = new int[n][m];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.print("Enter index: ");
        t = sc.nextInt();
        System.out.print("The element is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count++;
                if (count == t) {
                        System.out.print(a[i][j]);
                    break;
                }
            }
        }
        sc.close();
    }
}
