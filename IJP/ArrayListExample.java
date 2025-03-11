package IJP;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Indian");
        countries.add("South Africa");
        countries.add("Australia");
        countries.add("New Zealand");
        countries.add("England");

        System.out.println(countries.size());
        Collections.sort(countries); // Sort in Ascending Order
//        Collections.sort(countries, Collections.reverseOrder()); // Sort in Descending order

        System.out.println(countries);
    }
}
