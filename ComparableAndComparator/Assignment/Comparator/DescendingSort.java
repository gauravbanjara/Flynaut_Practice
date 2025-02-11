package ComparableAndComparator.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,54,62,84,15,27));

        Collections.sort(numbers, new DescendingNumberSort());
        System.out.println(numbers);
    }
}

