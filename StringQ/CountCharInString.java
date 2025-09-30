package StringQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "chatrapati";
        HashMap<Character,Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count.containsKey(ch)){
                count.put(ch, count.get(ch)+1);
            }else {
                count.put(ch,1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : count.entrySet())
//             if(entry.getValue() > 1){
//                 System.out.println(entry);
//             }

        Iterator<Map.Entry<Character,Integer>> iterator = count.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

