package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(60);
        arr.add(20);
        arr.add(40);
        arr.add(80);


//      Sort arraylist inn ascending order
        Collections.sort(arr);
        System.out.println(arr);

//      Sort ArrayList in descending order
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
