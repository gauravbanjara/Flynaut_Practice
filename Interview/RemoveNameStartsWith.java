package Interview;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNameStartsWith {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("gaurav");
        names.add("mahipal");
        names.add("mukesh");
        names.add("akash");
        names.add("murli");
        names.add("anil");

        System.out.println("Original List : "+names);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.startsWith("g")){
                iterator.remove();
            }
        }
        System.out.println("List After removal : "+names);
    }
}
