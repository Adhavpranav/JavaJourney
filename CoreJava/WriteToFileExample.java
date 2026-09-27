package FileHandling;

import java.io.*;
public class WriteToFileExample {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("Temp.txt");
            fileWriter.write("Name: Pranav\n" +
                    "Course: MSc Computer Science\n" +
                    "College: Fergusson College");
            fileWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred."+e.getMessage());
        }
    }
}
