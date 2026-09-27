package FileHandling;

import java.io.*;

public class FilePropertiesExample {
    public static void main(String[] args) {
        File file=new File("Temp.txt");

        String fileName= file.getName();
        System.out.println("File name: "+fileName);

        String fileAbsolutePath=file.getAbsolutePath();
        System.out.println("File Absolute Path: "+fileAbsolutePath);

        boolean isExists=file.exists();
        if(isExists){
            System.out.println("File Exists");
        }else{
            System.out.println("File Not Exists");
        }

        boolean isFile=file.isFile();
        if(isFile){
            System.out.println("Its a file");
        }else {
            System.out.println("Its not a file");
        }

        boolean isDirectory=file.isDirectory();
        if(isDirectory){
            System.out.println("Its a directory");
        }else{
            System.out.println("Its not a directory");
        }

        boolean canRead=file.canRead();
        if(canRead){
            System.out.println("Its a readable");
        }else {
            System.out.println("Its not a readable");
        }

        boolean canWrite=file.canWrite();
        if(canWrite){
            System.out.println("Its a writable");
        }else{
            System.out.println("Its not a writable");
        }

        long fileLength=file.length();
        System.out.println("File length: "+fileLength);
    }
}
