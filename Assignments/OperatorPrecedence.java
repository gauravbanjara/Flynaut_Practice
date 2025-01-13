public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2, d = 8, e = 4;
        int result = a + b * c - d / e; //5 + 3 * 2 - 8 / 4;
        System.out.println("the result is: "+result);

        /*
         * Order
         * 1. Multiplication (*) and division (/) are performed first, from left to right.
         *    - 3 * 2 = 6
         *    - 8 / 4 = 2
         * 2. Addition (+) and subtraction (-) are performed next, from left to right.
         *    - 5 + 6 = 11
         *    - 11 - 2 = 9
         */
    }
}










