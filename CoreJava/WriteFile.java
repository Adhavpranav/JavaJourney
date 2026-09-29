import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Java File Handling");
            writer.write("\nLearning Java every day!");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
