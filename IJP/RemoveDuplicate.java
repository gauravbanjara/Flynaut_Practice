package IJP;

import java.util.LinkedHashSet;

// using collections
public class RemoveDuplicate {
    public static String removeDiplicate(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()){
            if (set.add(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }

    // without using collections
    private static String removeDiplicateWithoutCF(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char ch : str.toCharArray()){
            if (!seen[ch]){
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "gaurav banjara";
        System.out.println("Original String : "+str);
        System.out.println(removeDiplicate(str));
        System.out.println(removeDiplicateWithoutCF(str));
    }

}
