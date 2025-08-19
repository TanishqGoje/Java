public class Pattern {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 3");
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 4");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(4 - i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 5");
        int n = 4; // Number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 6");
        n = 30;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i >= 1 && i < n - 1) && (j >= 1 && j < n - 1)){
                    System.out.printf("  ");
                }
                else {
                System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}