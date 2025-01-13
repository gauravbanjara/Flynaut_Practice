import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 3 subjects: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40 && average >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}


