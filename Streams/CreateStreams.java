package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        // 1. From a List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamFromList = list.stream();

        // 2. From an Array
        Stream<String> streamFromArray = Stream.of("A", "B", "C");

        // 3. Using Stream.of()
        Stream<Integer> directStream = Stream.of(10, 20, 30);

        // 4. Using Stream.generate() (infinite stream)
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);

        randomNumbers.forEach(System.out::println);
    }
}
