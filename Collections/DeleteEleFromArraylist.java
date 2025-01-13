package Collections;

import java.util.ArrayList;
import java.util.List;

public class DeleteEleFromArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gaurav");
        list.add("Mahipal");
        list.add("Mukesh");
        list.add("Akash");
        list.add("Neha");
        list.add("Mohini");

        System.out.println(list);

//      remove element from arraylist using remove(index) based on index;
        list.remove(2);
        System.out.println(list);

//      remove element from arraylist using remove(object); based on object name
        list.remove("Neha");
        System.out.println(list);

//        Remove multiple element from arraylist using removeAll();
        List<String> sports = new ArrayList<>();
        sports.add("Gaurav");
        sports.add("Mahipal");
        list.removeAll(sports);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
