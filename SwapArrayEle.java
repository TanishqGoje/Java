import java.util.Arrays;

public class SwapArrayEle {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        Arrays.sort(arr);
        int k = 4;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = k; i < (arr.length + k); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1 + k];
            arr[arr.length - i - 1 + k] = temp;
        }                                                                            
    }
}