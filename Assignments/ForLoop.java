import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("The first "+n+" natural number are: "+i);
        }
    }
}


