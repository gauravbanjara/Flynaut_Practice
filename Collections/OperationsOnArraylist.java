package Collections;
import java.util.ArrayList;
import java.util.List;

public class OperationsOnArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gaurav");
        list.add("Mahipal");
        list.add("Mukesh");
        list.add("Akash");
        System.out.println(list);

        // how to check if an arraylist is empty or not using isEmpty();
        System.out.println(list.isEmpty());

        // how to find size of an array using size();
        System.out.println(list.size());

        // how to access particular element from an arraylist using get();
        System.out.println(list.get(2));

        // how to modify arraylist using set();
        list.set(1, "Komal");
        System.out.println(list);

    }
}
