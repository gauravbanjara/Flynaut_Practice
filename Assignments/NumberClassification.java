import java.util.Scanner;
public class NumberClassification {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for(int i=2; i <= num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    static boolean isPalindrome(int num) {
        int result = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return result == reverse;
    }
    static boolean isArmstrong(int n){
        int num = n;
        int result = 0;
        while(num > 0){
            int a = num % 10;
            result = result + a * a * a;
            num = num / 10;
        }
        return result == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number))
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is NOT a Prime number.");

        if (isPalindrome(number))
            System.out.println(number + " is a Palindrome number.");
        else
            System.out.println(number + " is NOT a Palindrome number.");

        if (isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is NOT an Armstrong number.");
    }
}
