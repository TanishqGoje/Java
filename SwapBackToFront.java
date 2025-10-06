import java.util.*;
public class SwapBackToFront {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,1,2,3,4};
        System.out.print("Enter no. of rotations: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = arr[n-i-1];
            arr[n-i-1]=arr[i];
            arr[i]=temp;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }
        sc.close();
    }
}