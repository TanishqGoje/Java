import java.util.*;

public class AlphaToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                System.out.print(str.charAt(i) - 96 + " ");
            } else if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i) - 64 + " ");
            }
        }
        sc.close();
    }
}
