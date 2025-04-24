package IJP;

import java.util.LinkedHashSet;

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
    public static void main(String[] args) {
        String str = "information hello good morning";
        System.out.println("Original String : "+str);
        System.out.println(removeDiplicate(str));
    }
}
