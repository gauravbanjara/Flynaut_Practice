package StringQ;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listenj";

        if (str1.length() != str2.length()) {
            System.out.println(false);
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2))
             System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
