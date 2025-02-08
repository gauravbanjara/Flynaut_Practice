package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//        Creating ArrayList object
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("one"); // duplicate values are allowed
        list.add("two");
        list.add("three");
        list.add("five");
        list.add(null); // null values are allowed
        list.set(1,"Gaurav");
        System.out.println(list);

//       access the element using index
        System.out.println(list.get(3));
    }
}
