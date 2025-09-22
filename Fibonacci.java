import java.util.*;
public class Fibonacci {
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		int c;
		Scanner uv = new Scanner(System.in);
		int n = uv.nextInt();
		uv.close();
		if (n >= 1) System.out.print(a + " ");
		if (n >= 2) System.out.print(b + " ");
		for (int i = 3; i <= n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
