package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // stack uses the LIFO method means the element entered at the last deleted or get first
        Stack<Integer> marks = new Stack<>();
        marks.push(78);
        marks.push(88);
        marks.push(95);
        marks.push(68);
        marks.push(89);

        marks.pop();
        System.out.println(marks.peek());
        System.out.println(marks.isEmpty());
        System.out.println("size of stack is: "+marks.size());
        System.out.println(marks);
    }
}
