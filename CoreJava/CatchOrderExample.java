package ExceptionHandling;

public class CatchOrderExample {
    public static void main(String[] args) {
        try{
            int []arr={10,20,30};
            int ans=arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {// it is Child class who extends ArrayOutOfBoundException
            System.out.println("Array Index Out Of Bounds ");
        }catch (IndexOutOfBoundsException e){//it is base class
            // so first write child then parent ...
            //Always put the more specific (child) exception before the more general (parent) exception.
            System.out.println("Index Out Of Bounds");
        }
    }
}
