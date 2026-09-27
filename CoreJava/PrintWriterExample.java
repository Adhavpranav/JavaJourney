package FileHandling;

import java.io.*;
public class PrintWriterExample {
    public static void main(String[] args) {
        try{
            File file=new File("Temp.txt");
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.println("Hello World");
            System.out.println("Print succ");
            printWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
