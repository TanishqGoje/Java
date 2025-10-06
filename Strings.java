import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(); // It is a non-static method which takes a whole sentence from user
        System.out.println("Lengt of String: " + s1.length()); // s1.length gives the length of the string
        System.out.print(s1.charAt(0));
        String s2 = s1.substring(2, 8);
        System.out.println(s2);
        s1 = "help";
        s2 = "help";
        if (s1.equals(s2))
            System.out.println("Same");
        else
            System.out.println("Not Same");
        s2 = "hElP";
        if (s1.equalsIgnoreCase(s2))
            System.out.println("Same");
        else
            System.out.println("Not Same");
        s2 = s1.toUpperCase();
        System.out.println(s2);
        s1 = "hippopotamus";
        s2 = s1.replace('p', 'k');
        s2 = s1.replaceAll("[0-9]", "");
        System.out.println(s2);
        s1 = "he23145346p54765";
        char[] charr = s1.toCharArray();
        s1 = "hello";
        String reversed = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
        sc.close();
    }
}