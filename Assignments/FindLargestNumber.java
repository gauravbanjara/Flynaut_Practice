import java.util.Scanner;
public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        // Find the largest number using Ternary Operator
        int largest = (a > b && a > c) ? a : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
    }
}


