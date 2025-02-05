package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinandMaxExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(52,63,98,1,25);
        int min = Collections.min(num);
        System.out.println(min);
        int max = Collections.max(num);
        System.out.println(max);

        Collections.sort(num);
        System.out.println(num);

        Collections.reverse(num);
        System.out.println(num);
    }
}
