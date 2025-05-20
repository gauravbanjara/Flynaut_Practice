package IJP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "hello hii good morning nice how are you";
        StringBuilder result = new StringBuilder();
        // Boolean array to track seen characters (assuming ASCII characters)
        boolean[] arr = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!arr[ch]) {
                result.append(ch);
                arr[ch] = true;
           }
        }
        System.out.println(result);

        // using collections
//        LinkedHashSet<Character> chars = new LinkedHashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            chars.add(str.charAt(i));
//        }
//        StringBuilder result = new StringBuilder();
//        for (char ch : chars){
//            result.append(ch);
//        }
//        System.out.println(result);
    }
}

