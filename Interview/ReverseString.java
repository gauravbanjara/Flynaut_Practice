package Interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Tony Stark";
        reverseString(str);
    }
    private static void reverseString(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
