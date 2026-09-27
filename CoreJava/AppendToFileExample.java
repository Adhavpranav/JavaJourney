package FileHandling;
import java.io.*;

public class AppendToFileExample {
    public static void main(String[] args)  {
        try {
            FileWriter writer=new FileWriter("Temp.txt",true);
            String appendData="This is appended data";
            writer.append(appendData);
            writer.close();

            FileReader reader=new FileReader("Temp.txt");
            int currentCharater;
            while((currentCharater=reader.read())!=-1){
                System.out.print((char)currentCharater);
            }
            reader.close();


        }catch (IOException e){
            System.out.println("Error in appending file");
        }
    }
}
