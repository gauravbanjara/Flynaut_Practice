import java.util.Scanner;
public class ElectricityCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        double charges = 0;
        if (units <= 100) {
            charges = units * 5;
        } else if (units <= 200) {
            charges = (100 * 5) + ((units - 100) * 7);
        } else {
            charges = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }
        System.out.println("Total Electricity Charges: ₹" + charges);
        scanner.close();
    }
}

