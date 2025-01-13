package Exception;

public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;

        try {
            //Attempting to call a method on a null object
            System.out.println("Length of the String: "+ str.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code is executed");
    }
}
