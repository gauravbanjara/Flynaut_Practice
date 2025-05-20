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
        System.out.println("--------------------------------------");
        Collections.sort(countries, Collections.reverseOrder()); // Sort in Descending order

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if(name.startsWith("P")){
                iterator.remove();
            }
        }


        Iterator<String> iterator1 = countries.iterator();
        while (iterator1.hasNext()){
            String country = iterator1.next();
            if(country.endsWith("n")){
                iterator1.remove();
            }
        }
        System.out.println(countries);
    }
}