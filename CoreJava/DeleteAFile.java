package FileHandling;
import java.io.*;

public class DeleteAFile {
    public static void main(String[] args) {
        File file=new File("om.txt");
        if(file.delete()){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("Error deleting file");
        }
    }
}
