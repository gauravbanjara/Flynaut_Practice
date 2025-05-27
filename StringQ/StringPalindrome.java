package StringQ;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder result = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ; i--) {
            result.append(str.charAt(i));
        }
        if (str.contentEquals(result)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
