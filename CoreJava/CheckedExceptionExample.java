package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    static void readFile() throws FileNotFoundException {
        // FileNotFoundException is a subclass of IOException
        //here we can handle  with try catch
        //or Declare it with throws
        //currently readFile() not handling it so it pass responsibility whoo call it
            FileReader file = new FileReader("src/ExceptionHandling/test.txt");
    }
    public static void main(String[] args) {
        try{
            // here we must have to handle it
            //If main() also doesn't want to handle it, it can pass it further:
            //Then the responsibility goes to the JVM/caller of main.
            CheckedExceptionExample.readFile();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            //It prints if file was not founded
        }
    }
}
