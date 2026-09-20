package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    static void readFile() throws  IOException {
        try(FileReader fileReader=new FileReader("src/ExceptionHandling/test.txt")){
            //using this we don't have to manually close the resource
            //when try block finish java auto call close() method on fileReader
            System.out.println("File Open Successfully");
        }
    }

    public static void main(String[] args) {
        try{
            readFile();
        }catch (IOException ioException){
            System.out.println("File Not Found");
        }
    }
}
