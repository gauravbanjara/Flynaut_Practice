package Interview;

import java.util.HashMap;
import java.util.Map;

public class CountChar{
    private static void countChar(String str) {
        HashMap<Character, Integer> count  = new HashMap<>();
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            if (count.containsKey(ch)){
                count.put(ch,count.get(ch)+1);
            }else {
                count.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : count.entrySet()){
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "chatrapati";
        countChar(str);
    }
}
