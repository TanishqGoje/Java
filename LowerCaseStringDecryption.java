import java.util.*;

public class LowerCaseStringDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the encrypted text: ");
        String text = sc.nextLine();
        System.out.print("Enter the shift value used to encrypt: ");
        int shift = sc.nextInt();

        System.out.println();
        System.out.println("Encrypted text: " + text);
        System.out.println("Shift value   : " + shift);
        System.out.println();

        StringBuilder decrypted = new StringBuilder();
        int effectiveShiftAlpha = ((shift % 26) + 26) % 26;
        int effectiveShiftDigit = ((shift % 10) + 10) % 10;

        System.out.println("Decrypting character by character:");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char d = c;
            String note = "unchanged";

            if (c >= 'a' && c <= 'z') {
                d = (char) ('a' + (c - 'a' - effectiveShiftAlpha + 26) % 26);
                note = "lowercase";
            } else if (c >= 'A' && c <= 'Z') {
                d = (char) ('A' + (c - 'A' - effectiveShiftAlpha + 26) % 26);
                note = "uppercase";
            } else if (c >= '0' && c <= '9') {
                d = (char) ('0' + (c - '0' - effectiveShiftDigit + 10) % 10);
                note = "digit";
            }

            decrypted.append(d);
            System.out.println("Index " + (i + 1) + ": '" + c + "' -> '" + d + "' (" + note + ")");
        }

        System.out.println();
        System.out.println("Decrypted text: " + decrypted.toString());
        sc.close();
    }

}
