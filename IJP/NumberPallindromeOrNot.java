package IJP;

public class NumberPallindromeOrNot {
    public static void main(String...args){
        int n = 12321;
        int sum = 0;
        int num = n;
        while (num > 0){
            int a = num % 10;
            sum = sum * 10 + a;
            num = num / 10;
        }
        System.out.println(sum);

        if(n == sum)
            System.out.println("pallindrome");
        else
            System.out.println("No pallindrome");

    }
}