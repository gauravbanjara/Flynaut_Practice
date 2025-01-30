package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // hashset does not allow duplicate values
        // hashset don't follow insertion order
        HashSet<String> guns = new HashSet<>();
        guns.add("M416");
        guns.add("AKM");
        guns.add("AWM");
        guns.add("UPM45");
        guns.add("Kar98");

        System.out.println(guns.contains("AKM"));
        guns.remove("Kar98");
        System.out.println(guns.size());
        System.out.println(guns);
    }
}
