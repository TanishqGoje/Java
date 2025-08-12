import java.util.*;
public class StrConcatenation {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first character: ");
        //sc.nextLine();
        char a = sc.nextLine().charAt(0);
        System.out.print("Enter first character: ");
        //sc.nextLine();
        char b = sc.nextLine().charAt(0);
        System.out.print("Enter first character: ");
        //sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(a+b+c); //ASCII values of the characters are concatenated
        sc.close();
    }
}
