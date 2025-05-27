package StringQ;

import java.util.LinkedHashSet;

public class RemoveDuplicateformString {
    public static void RemoveDuplicate(String str){
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]){
                result.append(ch);
                seen[ch] = true;
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        String str = "ironman";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (set.add(ch)){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        RemoveDuplicate(str);
    }
}
