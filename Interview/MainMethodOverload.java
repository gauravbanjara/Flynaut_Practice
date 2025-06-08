package Interview;

public class MainMethodOverload {
    public static void main(int a, int b){
        System.out.println(a + b);
    }
    public static void main(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        main(10,20);
        main(10,20,3);
    }
}
