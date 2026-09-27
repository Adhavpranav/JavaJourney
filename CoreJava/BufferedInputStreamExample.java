package FileHandling;
import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try{
            File file=new File("data.txt");
            FileInputStream fileInputStream=new FileInputStream(file);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int currentCharacter;
            while((currentCharacter=bufferedInputStream.read())!=-1){
                System.out.print((char)currentCharacter);
            }
            bufferedInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
