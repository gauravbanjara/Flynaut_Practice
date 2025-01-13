import java.util.Scanner;
public class SpecialNumber {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;
        return fact;
    }
    public static boolean isSpecialNumber(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Input must be a 3-digit number.");
        }
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + factorial(digit);
            number = number/10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        if (isSpecialNumber(number))
            System.out.println(number + " is a special number.");
        else
            System.out.println(number + " is not a special number.");
    }
}

