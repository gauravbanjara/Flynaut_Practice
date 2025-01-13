import java.util.Scanner;
public class AdvanceDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Check if a Number is Prime");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to calculate its factorial: ");
                    int num = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= num; i++)
                        factorial *= i;
                    System.out.println("Factorial: " + factorial);
                    break;
                case 2:
                    System.out.print("Enter a number to check if it is prime: ");
                    int number = scanner.nextInt();
                    boolean isPrime = true;
                    if (number <= 1) {
                        isPrime = false;
                    } else {
                        for(int i=2; i <= number/2; i++){
                            if(number % i == 0){
                            isPrime = false;
                            break;
                            }
                        }
                    }
                    if (isPrime)
                        System.out.println(number + " is a prime number.");
                    else
                        System.out.println(number + " is not a prime number.");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}
