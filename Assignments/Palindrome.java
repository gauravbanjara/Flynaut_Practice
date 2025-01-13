import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num; // Store the original num
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Build the reversed num
            num /= 10; // Remove the last digit
        }
        if (n == reverse)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}
