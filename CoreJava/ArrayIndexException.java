package ExceptionHandling;

public class ArrayIndexException {
    public static void main(String[] args) {
        int []arr={10,20,30,40};
        System.out.println("Step 1");
        //System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        try{
            System.out.println(arr[10]);
            System.out.println("Step 2");// it will be skip ...
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
        System.out.println("Step 3");
    }
}
