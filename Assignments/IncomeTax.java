import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income > 250000 && income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income > 500000 && income <= 1000000) {
            tax = 0.05 * 250000 + 0.20 * (income - 500000);
        } else {
            tax = 0.05 * 250000 + 0.20 * 500000 + 0.30 * (income - 1000000);
        }
        System.out.println("Your Income Tax Payable: ₹" + tax);
        scanner.close();
    }
}


