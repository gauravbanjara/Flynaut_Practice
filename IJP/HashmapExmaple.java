package IJP;

import java.util.HashMap;
import java.util.Map;

public class HashmapExmaple {
    public static void main(String[] args) {
        HashMap<Integer,String> sports = new HashMap<>();

        sports.put(1,"Cricket");
        sports.put(2,"Football");
        sports.put(3,"Kabbadi");
        sports.put(4,"kho  kho");

        System.out.println(sports.containsValue("Football"));

        System.out.println(sports);
        System.out.println(sports.get(2));
        System.out.println(sports.keySet());
        System.out.println(sports.entrySet());

        sports.replace(1,"bigger Game");

//        sports.remove(3);
//        sports.remove(1,"Cricket");
//        System.out.println(sports);

        // Traverse using for-each loop
        for (Map.Entry<Integer, String> entry : sports.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for(Integer key : sports.keySet()) {
            System.out.println(key);
        }


        for (Integer key : sports.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sports.get(key));
        }

    }
}
