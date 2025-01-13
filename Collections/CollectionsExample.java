package Collections;
import java.util.*;
public class CollectionsExample {
    public static void main(String[] args) {
        Collection<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Papaya");

        System.out.println(Fruits);

        Fruits.remove("Mango");
        System.out.println(Fruits);

        System.out.println(Fruits.contains("Apple"));

        Fruits.forEach((Ele) ->{
            System.out.println(Ele);
        });
    }
}
