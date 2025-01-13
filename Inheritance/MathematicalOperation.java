package Inheritance;

public class MathematicalOperation {
    int Multiply(int a, int b){
       return a*b;
    }
    int Multiply(int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        MathematicalOperation obj = new MathematicalOperation();
        System.out.println( obj.Multiply(10,20));
        System.out.println(obj.Multiply(10,8,12));
    }
}


