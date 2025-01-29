package Collections.CollectionAssignment;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding 5 integers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        // Insert an integer at the second position.
        numbers.add(1,15);

        // Remove an integer by its value
        numbers.remove(Integer.valueOf(10));

        // Remove an integer by its index.
        numbers.remove(3); // it will remove 40

        for(int num : numbers)
            System.out.println(num);

        // Find the sum of all elements in the ArrayList.
        int  sum = 0;
        for ( int num : numbers){
            sum += num;
        }
        System.out.println("The sum of all elements in the ArrayList is: " + sum);
    }
}
