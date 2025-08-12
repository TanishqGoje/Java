import java.util.*;

public class ReverseOfNum {
	public static void main(String[] args) {
		Scanner uv = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = uv.nextInt();
		int temp = n;
		int rev = 0, rem = 0;
		int count = 0;
		for (int i = 1; i <= 100000; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.print(n / 2);
		} else if (count != 2) {
			while (n != 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			System.out.print("Reverse of " + temp + " is " + rev);
		}
		uv.close();
	}
}