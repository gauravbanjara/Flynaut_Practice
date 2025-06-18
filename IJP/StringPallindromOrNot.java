package IJP;

public class StringPallindromOrNot {
    private static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return str.contentEquals(result);
    }
    public static void main(String[] args) {
        String  s = "abcba";
        System.out.println(isPalindrome(s));
    }
}