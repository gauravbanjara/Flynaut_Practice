package Exception;

public class NullPointerExample  {
   public void Display(String str){
       try {
           System.out.println(str.length());
       }catch(NullPointerException e){
           System.out.println("Error Message : "+e.getMessage());
       }
    }
    public static void main(String[] args) {
        String str = null;
        NullPointerExample np = new NullPointerExample();
        np.Display(str);
        System.out.println("Rest of the code is executed");
    }
}
