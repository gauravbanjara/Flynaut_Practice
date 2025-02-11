package ComparableAndComparator.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorController {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Iron Man",24));
        students.add(new Student(1,"Thor",24));
        students.add(new Student(1,"Panther",24));
        students.add(new Student(1,"Spider man",24));
        students.add(new Student(1,"Captain America",24));


        Collections.sort(students,new NameComparator());
        for (Student std : students){
            System.out.println(std);
        }
    }
}


