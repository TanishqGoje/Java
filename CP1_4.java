public class CP1_4 {
    public static int sumOfOddNumbers(int[] arr) {
        return java.util.Arrays.stream(arr)
                .filter(n -> n % 2 != 0)
                .sum();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 5, 12, 7, 6, 9};
        int sum = sumOfOddNumbers(numbers);
        System.out.println("Sum of odd numbers: " + sum);
    }
}
