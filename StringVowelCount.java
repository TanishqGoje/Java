import java.util.*;

public class StringVowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (lower case): ");
        String str = sc.nextLine();
        int vowCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowCount++;
            }
        }
        String[] words = str.trim().split("\\s+"); // trim removes the white spaces at the start and end of the string;
                                                   // split breaks string into pieces based on a pattern; "\\s+" is a
                                                   // regular expression (regex) meaning: \s → any whitespace (space, tab, newline),
                                                   // + → one or more times;
                                                   //So "\\s+" means “split wherever there is one or more spaces”.
        int wordCount = words.length;
        System.out.println("Number of vowels in the string \"" + str + "\": " + vowCount);
        System.out.println("Number of words in the string \"" + str + "\": " + wordCount);
        sc.close();
    }
}
