package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentController {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Gaurav",25,95));
        student.add(new Student("Mahipal",22,75));
        student.add(new Student("Akash",12,91));
        student.add(new Student("Mukesh",35,85));

        Collections.sort(student, new MarksComparator());

        System.out.println(student);
    }
}
