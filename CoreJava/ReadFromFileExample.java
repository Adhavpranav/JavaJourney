package FileHandling;
import java.io.*;
import java.util.*;

public class ReadFromFileExample {
    public static void main(String[] args) {
        try{
           File file=new File("Temp.txt");

           Scanner scanner=new Scanner(file);
          while (scanner.hasNextLine()){
             String line=scanner.nextLine();
              System.out.println(line);
          }
          scanner.close();

//            FileReader fileReader=new FileReader(file);
//            int currentCharacter;
//            while((currentCharacter=fileReader.read())!=-1){
//                System.out.print((char)currentCharacter);
//            }
//            fileReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
