package IJP;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        while (n > 0){
            int a = n % 10;
            sum = a * 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
