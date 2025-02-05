package Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> friuts = new TreeSet<>();
        friuts.add("Mango");
        friuts.add("Berry");
        friuts.add("PineApple");
        friuts.add("Strawberry");
        friuts.add("Apple");

        System.out.println(friuts);
        System.out.println(friuts.headSet("PineApple"));
        System.out.println(friuts.tailSet("PineApple"));
        System.out.println(friuts.subSet("Mango","Strawberry"));
    }
}
