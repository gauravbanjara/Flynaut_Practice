package Exception;

public class NullPointerExample  {
   public static void Display(String str){
       try {
           System.out.println(str.length());
       }catch(NullPointerException e){
           System.out.println("Error Message : "+e.getMessage());
       }
    }
    public static void main(String[] args) {
        String str = null;
        Display(str);
        System.out.println("Rest of the code is executed");
    }
}
