package FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File file=new File("Student.txt");
        //It checks file exits or not
        if(file.exists()){
            System.out.println("File exists");
        }

        //It gives file name
        String fileName=file.getName();
        System.out.println("File name :"+fileName);

        //C:\Users\Snehal\IdeaProjects\JavaDev\Student.txt
        String absolutePath=file.getAbsolutePath();
        System.out.println("Absolute Path :"+absolutePath);

        //It will check file actually file or not
        boolean isFile=file.isFile();
        System.out.println("File is File :"+isFile);
        
        //It will check Is it Directory or not
        boolean isDirectory=file.isDirectory();
        System.out.println("File is Directory :"+isDirectory);
    }
}
