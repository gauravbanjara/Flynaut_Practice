package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gaurav", "Panther", "Komal");
        System.out.println(names);
        Collections.replaceAll(names,"Komal", "Jadhav");
        System.out.println(names);
    }
}
