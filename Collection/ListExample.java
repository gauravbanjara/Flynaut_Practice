package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
//        list interface is ordered collection of element
//        list interface can have null and duplicate values
//        List interface maintain the insertion order
//        ArrayList, LinkedList, Vector, Stack are the implementing class of list interface

        List<String> list = new ArrayList<>();
        // for  inserting element in list
        list.add("one");
        list.add("one"); // duplicate values are allowed
        list.add("two");
        list.add("three");
        list.add("five");
        list.add(null); // null values are allowed
        System.out.println(list);


    }
}
