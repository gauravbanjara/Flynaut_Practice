package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyMethodExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        List<Integer> copyNumber = new ArrayList<>(Arrays.asList(0,0,0,0,0));
//        List<Integer> copyNumber = new ArrayList<>(number);

        Collections.copy(copyNumber, number);
        System.out.println(number);
        System.out.println(copyNumber);
    }
}
