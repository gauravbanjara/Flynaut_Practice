import java.util.Scanner;
public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side:");
        int a = sc.nextInt();
        System.out.println("Enter the second side:");
        int b = sc.nextInt();
        System.out.println("Enter the third side:");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("The numbers can form a valid triangle.");
        else
            System.out.println("The numbers cannot form a valid triangle.");
    }
}

