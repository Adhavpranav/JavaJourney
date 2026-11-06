package Collection;

import java.util.ArrayDeque;

public class ArrayDequeBasicOperations {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            arrayDeque.add(i*10);
        }

        for(Integer integer : arrayDeque){
            System.out.println(integer);
        }

        System.out.println("First element :"+arrayDeque.getFirst());
        System.out.println("Last element :"+arrayDeque.getLast());

        System.out.println(arrayDeque.contains(30));

        System.out.println(arrayDeque.remove(20));

        System.out.println(arrayDeque);

        System.out.println("Size of ArrayDeque :"+arrayDeque.size());

        
    }
}
