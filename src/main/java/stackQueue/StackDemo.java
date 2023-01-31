package stackQueue;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println("The element at the top of the"
                + " stack is: " + stack2.peek());
        System.out.println("Popped element: "
                + stack2.pop());
        System.out.println(stack2);
    }
}
