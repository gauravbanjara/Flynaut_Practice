public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        do{
            sum = sum + n;
            n++;
        }while (n <= 5);
        System.out.println("The sum of integers from 1 to 5 is: "+sum);
    }
}


