import java.util.Scanner;

public class UpperLowerCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int lc = 0;
        int uc = 0;
        int dc = 0;
        for(int i = 0; i< str.length();i++){
            if(str.charAt(i) <= 90 && str.charAt(i) >= 65){
                uc++;
            }
            else if(str.charAt(i) <= 122 && str.charAt(i) >= 97){
                lc++;
            }
            else if(str.charAt(i) <= '9' && str.charAt(i) >= '0'){
                dc++;
            }
        }
        System.out.println("Number of upper case alphabets in the string \"" + str + "\": " + uc);
        System.out.println("Number of lower case alphabets in the string \"" + str + "\": " + lc);
        System.out.println("Number of digits in the string \"" + str + "\": " + dc);
        sc.close();
    }
}
