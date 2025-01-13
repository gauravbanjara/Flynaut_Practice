import java.util.Scanner;
public class CenturyLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.println(year + " is a Century Leap Year.");
            else
                System.out.println(year + " is not a Century Leap Year.");
        } else {
            System.out.println(year + " is not a Century Year.");
        }
    }
}

