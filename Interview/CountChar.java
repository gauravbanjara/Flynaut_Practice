package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChar{
    private static void countChar(String str) {
        Map<Character,Integer> count  = new LinkedHashMap<>();
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
