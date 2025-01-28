package Collections;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Start laptop");
        tasks.add("start to code");
        tasks.add("run code");
        tasks.add("find errors");

        tasks.addFirst("prepare to code");
        tasks.addLast("Solve the errors");
//        tasks.remove("Start laptop");
//        tasks.remove(1);
        for (String ele : tasks){
            System.out.println(ele);
        }
    }
}
