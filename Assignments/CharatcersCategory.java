import java.util.Scanner;

public class CharatcersCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a Vowel.");
            } else
                System.out.println("The character is a Consonant.");
        } else if (ch >= '0' && ch <= '9')
            System.out.println("The character is a Digit.");
        else
            System.out.println("The character is a Special Character.");

    }
}


