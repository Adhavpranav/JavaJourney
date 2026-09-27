package FileHandling;

import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) {
       try{

           String data="Hello, File Handling!";
           File file=new File("data.txt");
           FileOutputStream fileOutputStream=new FileOutputStream(file);
           fileOutputStream.write(data.getBytes());
           System.out.println("File written Successfully");
            fileOutputStream.close();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
