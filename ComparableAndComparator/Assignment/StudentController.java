package ComparableAndComparator.Assignment;

import java.util.*;

public class StudentController {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Panther", 85.5),
                new Student(2, "Thor", 90.0),
                new Student(3, "Groot", 85.5),
                new Student(4, "Rocket", 95.0),
                new Student(5, "Tony", 75.0)));

        Collections.sort(students);
        for (Student std : students){
            System.out.println(std);
        }
    }
}

