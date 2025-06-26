package Exception;

public class NumberFormatExample {
    public static void main(String[] args) {
        String num = "123iguyt";
        try{
            int n = Integer.parseInt(num);
            System.out.println("Converted Number : "+n);
        }catch (NumberFormatException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
