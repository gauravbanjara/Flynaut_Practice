package Collection.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignement {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original list: "+numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending Order): " + numbers);
    }

}


