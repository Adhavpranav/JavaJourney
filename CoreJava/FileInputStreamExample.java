package FileHandling;
import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
       try{
           File file=new File("data.txt");
           FileInputStream fileInputStream=new FileInputStream(file);
//           int currentCharacter;
//           while ((currentCharacter=fileInputStream.read())!=-1){
//               System.out.print((char)currentCharacter);
//           }
           while(fileInputStream.available()>0){
               System.out.print((char) fileInputStream.read());
           }
           fileInputStream.close();
       }catch (IOException ioException){
           System.out.println(ioException.getMessage());
       }
    }
}
