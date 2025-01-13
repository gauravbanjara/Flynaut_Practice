import java.util.Scanner;
public class SumOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum = sum + (int) ch;
        }
        System.out.println("The sum of ASCII values of all characters is: " + sum);
    }
}



