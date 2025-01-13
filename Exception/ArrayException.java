package Exception;

public class ArrayException {
        public static void main(String[] args) {

            int[] arr = {1,2,3};
            try {
                System.out.println(arr[3]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
//            System.out.println("Exception is handled");
            }
            System.out.println("Rest of the code is executed");
        }
}
