package Collection;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            arrayDeque.push(i*10);
        }

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);

        arrayDeque.push(60);

        System.out.println(arrayDeque.contains(30));

        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque);
    }
}
