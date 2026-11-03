package Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackSearch {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] lang={"Java","Python","Php","C++","JavaScript"};
        Collections.addAll(stack,lang);

        System.out.println(stack.search("Java"));//5
        System.out.println(stack.search("Python"));//4

        System.out.println(stack.search("Go"));
        System.out.println(stack);
    }
}
