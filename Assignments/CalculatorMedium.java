import java.util.Scanner;
public class CalculatorMedium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %):");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+': result = num1 + num2;  break;
            case '-': result = num1 - num2;  break;
            case '*': result = num1 * num2;  break;
            case '/': if (num2 != 0) {
                result = num1 / num2;
                break; }
            else{
                System.out.println("Division by zero is not allowed.");
                break; }
            case '%': result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, /, or %.");
        }
        System.out.println("The result is: " + result);
        sc.close();
    }
}

