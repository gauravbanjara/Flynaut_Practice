import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(60);
        numbers.add(50);
        numbers.add(70);
        numbers.add(90);
        numbers.add(10);

        System.out.println("Original List : "+numbers);

        Set<Integer> num = new HashSet<>(numbers);

        ArrayList<Integer> newNum = new ArrayList<>(num);
        System.out.println("After  Removing duplicates List : "+newNum);
    }
}
