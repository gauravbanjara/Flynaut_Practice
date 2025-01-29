package Collections.CollectionAssignment;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        // Add 5 numbers to the Vector
        numbers.add(10);
        numbers.add(90);
        numbers.add(30);
        numbers.add(80);
        numbers.add(60);

        // Print all the elements in the Vector
        System.out.println("Elements in the Vector:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}


