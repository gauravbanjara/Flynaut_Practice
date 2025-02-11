package ComparableAndComparator.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstCharacter {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date", "watermelon"));
        Collections.sort(fruits, new FirstCharComparator());
        System.out.println("Sorted Strings by First Character:");
        System.out.println(fruits);
    }
}

