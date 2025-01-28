package Collections.Assignment;
import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        // Create a Vector to store test scores
        Vector<Integer> scores = new Vector<>();

        // Add 5 scores to the Vector
        scores.add(95);
        scores.add(85);
        scores.add(78);
        scores.add(93);
        scores.add(81);

        System.out.println("Original scores: " + scores);

        // Update the score at index 2 to a new value (e.g., 95)
        scores.set(2, 95); // Update index 2 (third element) to 95

        // Print all scores to see the changes
        System.out.println("Updated scores: " + scores);
    }
}


