public class OperatorPrecedenceMedium {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;
        int result = a * b + c / 5 - b;

        /*
         * Order
         * 1. Multiplication (*) and division (/) are performed first, from left to right:
         *    - a * b = 10 * 5 = 50
         *    - c / 5 = 20 / 5 = 4
         * 2. Addition (+) and subtraction (-) are performed next, from left to right:
         *    - 50 + 4 = 54
         *    - 54 - b = 54 - 5 = 49
         */
        System.out.println("The result is: " + result);
    }
}


