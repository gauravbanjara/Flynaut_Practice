package IJP;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> colors = new Hashtable<>();
        colors.put(1,"Red");
        colors.put(2,"White");
        colors.put(3,"Blue");

        System.out.println(colors.keySet());
        System.out.println(colors.get(1));
//        colors.replace(2,"Saffron"); // updates the values
        colors.put(2,"Saffron");  // updates the values
        System.out.println(colors.values());
    }
}
