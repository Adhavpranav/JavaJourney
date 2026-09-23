package Generics;

public class GenericReturnMethod {
    static <T> T getFirst(T[] arr){
        return arr[0];
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        String[] names = {"Java", "Python", "C++"};
        var result=getFirst(numbers);
        System.out.println(result);
        var ans=getFirst(names);
        System.out.println(ans);
    }
}
