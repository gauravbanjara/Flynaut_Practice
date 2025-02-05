package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArraylist {
    public static void main(String[] args) {
        List<String > courses = Arrays.asList("C", "Java", "Python", "C++", "Ruby");
//        Using  basic for loop
        for (int i = 0; i < courses.size(); i++)
            System.out.println(courses.get(i));

//        Using Enhance forLoop
        for(String course : courses)
            System.out.println(course);

//        forLoop with Iterator
        for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
            String course = iterator.next();
            System.out.println(course);
        }

    }
}
