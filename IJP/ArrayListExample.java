package IJP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Indian");
        countries.add("South Africa");
        countries.add("Australia");
        countries.add("New Zealand");
        countries.add("England");
        countries.add("Pakistan");

        System.out.println(countries.get(4));
        countries.set(2,"Oman");
        System.out.println(countries.size());

        System.out.println(countries);
        Collections.sort(countries); // Sort in Ascending Order
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        Collections.sort(countries, Collections.reverseOrder()); // Sort in Descending order
        Iterator<String> iterator1 = countries.iterator();
        while (iterator1.hasNext()){
            String name = iterator1.next();
            System.out.println(name);
//            System.out.println(iterator.next());  // if we want to print directly
        }
//
//        Iterator<String> iterator = countries.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//            if(name.startsWith("P")){
//                iterator.remove();
//            }
//        }
//
//        System.out.println("--------------------------------------");
//        Iterator<String> iterator2 = countries.iterator();
//        while (iterator2.hasNext()){
//            String name = iterator2.next();
//            System.out.println(name);
////            System.out.println(iterator.next());  // if we want to print directly
//        }

//        System.out.println(countries);
    }
}