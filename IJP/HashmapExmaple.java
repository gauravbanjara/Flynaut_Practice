package IJP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapExmaple {
    public static void main(String[] args) {
        HashMap<Integer,String> sports = new HashMap<>();

        sports.put(1,"Cricket");
        sports.put(2,"Football");
        sports.put(3,"Kabbadi");
        sports.put(4,"Kho kho");
        sports.put(5,"Fan");
        sports.put(6,"Ban");
        sports.put(7,"Kan");

        System.out.println(sports.containsValue("Football"));

//        sports.remove(3);
//        sports.remove(1,"Cricket");
//        System.out.println(sports);

        System.out.println(sports);
        System.out.println(sports.get(2));
        System.out.println(sports.keySet());
        System.out.println(sports.entrySet());

//        sports.replace(1,"bigger Game");

        for(Integer key : sports.keySet()) {
            System.out.println(key);
        }

        for (Integer key : sports.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sports.get(key));
        }

        // Traverse using Iterator
        Iterator< Map.Entry<Integer, String> >iterator = sports.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> sport = iterator.next();
            System.out.println("Keys : "+sport.getKey() +","+ " Values : "+sport.getValue());
//            System.out.println(iterator.next()); // if we want to print directly
        }

        // Traverse using for-each loop
//        for (Map.Entry<Integer, String> entry : sports.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        Iterator<Map.Entry<Integer, String>> iterator1 = sports.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> sport = iterator1.next();
            if (sport.getValue().endsWith("n")) {
                iterator1.remove();
            }
        }
        System.out.println("Updated HashMap: " + sports);
    }
}
