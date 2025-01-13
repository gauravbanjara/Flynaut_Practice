import java.util.Scanner;
public class DoWhileMedium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, n;
        do {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
                if (n >= 0) {
                    sum = sum + n; // Add positive numbers to the sum
                }
            } while (n >= 0); // Stop when a negative number is entered

            System.out.println("The sum of all positive numbers entered is: " + sum);
        }
}


