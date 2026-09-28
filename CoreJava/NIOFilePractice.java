package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOFilePractice {
    public static void main(String[] args) {
        Path path= Path.of("Ayushi.txt");
        try{
            Files.createFile(path);
            String studentDetails="Ayushi & Pranav : 143";
            Files.writeString(path,studentDetails);
            if(Files.exists(path)){
                System.out.println("File Created");
            }else{
                System.out.println("File Not Created");
            }
            System.out.println("File name: "+path.getFileName());
            System.out.println("File Absolute Path :"+path.toAbsolutePath());

            String appendData="I will prove my self";

            Files.writeString(path,appendData, StandardOpenOption.APPEND);

            System.out.println("File Content");
            String fileData=Files.readString(path);
            System.out.println(fileData);

            Files.delete(path);
            System.out.println("File Deleted");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
