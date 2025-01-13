package Exception;
import java.util.Scanner;

public class SimpleCalculator {
    public void add(int a, int b){
        System.out.println(a + b);
    }
    public void subtract(int a, int b){
        System.out.println(a - b);
    }
    public void multiply(int a, int b){
        System.out.println(a * b);
    }
    public void divide(int a, int b){
        try {
            System.out.println(a / b);
            throw new ArithmeticException("Cannot divide by zero.");
        }catch (ArithmeticException e){
            System.out.println("Exception is: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int a = sc.nextInt();
        System.out.println("Enter first no: ");
        int b = sc.nextInt();

        SimpleCalculator sm = new SimpleCalculator();
        sm.add(a,b);
        sm.subtract(a,b);
        sm.multiply(a,b);
        sm.divide(a,b);
    }
}

