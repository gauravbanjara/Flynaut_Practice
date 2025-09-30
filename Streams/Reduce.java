package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 6, 5, 8, 9, 7);
        int sum = number.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(sum);

//        Optional<Integer> min = number.stream()
//                .min(Comparator.naturalOrder());
//        System.out.println(min.get());

    }
}
