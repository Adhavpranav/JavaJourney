package Collection;

import java.util.Stack;

public class StackBasicOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<5;i++){
            stack.push(i);
        }

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
