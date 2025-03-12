package IJP;

public class ExceptionExample {
    public static void main(String[] args) {
        int [] arr = {5, 9, 8, 6, 2};
        try {
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access element: "+e.getMessage());
        }
    }
}

