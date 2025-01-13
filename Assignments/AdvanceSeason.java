import java.util.Scanner;
public class AdvanceSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Season: Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Season: Summer");
                break;
            case 6: case 7: case 8:
                System.out.println("Season: Rainy");
                break;
            case 9: case 10: case 11:
                System.out.println("Season: Spring");
                break;
            default:
                System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }
    }
}


