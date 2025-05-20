package IJP;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.offer("D");

        System.out.println(queue.poll());  // deletes element and return
        System.out.println(queue.peek());
    }
}
