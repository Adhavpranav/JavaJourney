package FileHandling;


import java.io.*;
import java.util.Scanner;

public class BufferedWriterExample {
    public static void main(String[] args) {
       try{
           File file=new File("Pranav.txt");
           if(file.createNewFile()){
               System.out.println("File created successfully");
           }

           String data="Name: Pranav\n" +
                   "Course: MSc Computer Science\n" +
                   "Age: 21";
           FileWriter writer=new FileWriter(file);
           BufferedWriter bufferedWriter=new BufferedWriter(writer);
           bufferedWriter.write(data);

           bufferedWriter.close();
           writer.close();

           Scanner scanner=new Scanner(file);
           System.out.println("File Data");
           while (scanner.hasNextLine()){
               System.out.println(scanner.nextLine());
           }
           scanner.close();

       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
