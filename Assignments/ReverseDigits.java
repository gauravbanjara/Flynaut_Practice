import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int result = 0;

        while (n != 0) {
            int a = n % 10; // Extract the last digit
            result = result * 10 + a; // Add it to the reversed number
            n /= 10; // Remove the last digit
        }
        System.out.println("The reversed number is: " + result);
    }
}


