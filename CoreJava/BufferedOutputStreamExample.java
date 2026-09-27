package FileHandling;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
       try{
           File file=new File("Spider.txt");
           FileOutputStream fileOutputStream=new FileOutputStream(file);
           BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
           String str="Hello Spidey";
           bufferedOutputStream.write(str.getBytes());
           System.out.println("File created ");
           bufferedOutputStream.close();

       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
