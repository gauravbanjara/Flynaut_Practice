package Exception;

public class NullPointerExample  {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("Error Message : "+e.getMessage());
        }
        System.out.println("Rest of the code is executed");
    }
}
