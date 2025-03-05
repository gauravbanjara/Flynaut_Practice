package Collection.CollectionAssignment;

import java.util.ArrayList;
import java.util.List;

public class TryCatchExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Panther");
        names.add("Thor");
        names.add("Iron Man");

        try {
            System.out.println("Accessing element at index 5: " + names.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid index.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

