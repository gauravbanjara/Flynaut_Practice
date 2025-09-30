package Streams;

import java.util.Arrays;
import java.util.List;

public class MapStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("gaurav","bob", "sam", "alex");
        names.stream()
                // it will take one data and convert into some another data
                // it acts as transformer
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
