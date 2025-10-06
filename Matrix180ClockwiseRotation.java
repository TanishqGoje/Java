public class Matrix180ClockwiseRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.print("Original MAtrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int n = matrix.length;
        System.out.print("Rotated Matrix (180 Clockwise):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2 || (i == n / 2 && j < n / 2)) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = temp;
                }
            }
        }
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}