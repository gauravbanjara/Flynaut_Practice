package Exception;

public class ArithMaticExceptionEG {
    public void sum(){
        int n = 40;
        try{
            System.out.println(n/0);
        }catch (ArithmeticException e) {
          throw new ArithmeticException("Can't Divide by zero");
        }
        System.out.println("GAurav JAdhav");
    }
    public static void main(String[] args) {
        ArithMaticExceptionEG eg = new ArithMaticExceptionEG();
        eg.sum();
    }
}
