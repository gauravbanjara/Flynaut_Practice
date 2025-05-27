package IJP;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);  // adds/insert element
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.search(40)); //  search any element

        System.out.println(stack.isEmpty()); // checks if It's empty or not
        System.out.println(stack.pop());  // deletes a top element and return
        System.out.println(stack.peek()); // returns top element
        System.out.println(stack.size()); // returns the size of stack
        stack.clear();  // clears the stack
        System.out.println(stack);
    }
}
