package Interview;

public class ExceptionExample {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException | StudentNotFoundException e) {
            System.out.println("Error message : "+e.getMessage());
        }
    }
}
