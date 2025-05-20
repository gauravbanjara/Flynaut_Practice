package IJP;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> count = new HashSet<>();
        count.add(10);
        count.add(20);
        count.add(65);
        count.add(58);
        count.add(30);

        System.out.println(count);
    }
}
