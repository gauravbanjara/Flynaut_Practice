package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 5, 7, 14, 44, 45);
        numbers.stream()
                // it will filter the data
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
