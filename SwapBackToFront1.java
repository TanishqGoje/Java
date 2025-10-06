import java.util.*;
public class SwapBackToFront1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c=1;
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] res = new int[n];
        int[] a = {1,2,3,4,5,6};
        for(int i=n-k;i<n;i++){
            res[c]=a[i];
            c++;
        }
        for(int i=0;i<n-k;i++){
            res[c]=a[i];
            c++;
        }
        sc.close();
    }
}
