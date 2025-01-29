package Collections.CollectionAssignment;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Double> scores = new Vector<>();
        // Adding 6 scores in vector
        scores.add(89.56);
        scores.add(95.78);
        scores.add(78.26);
        scores.add(82.35);
        scores.add(92.41);
        scores.add(90.60);

        // Update the score at the third position.
        scores.set(2,93.74);

        for (double score : scores){
            System.out.println(score);
        }
    }
}


