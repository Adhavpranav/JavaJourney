package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOCopyMovePractice {

    public static void main(String[] args) {

        Path path = Path.of("original.txt");

        try {
            Files.createFile(path);
            System.out.println("File created");

            String paragraph = "Hello I want to start my coffee shop";
            Files.writeString(path, paragraph);
            System.out.println("Content added into: " + path.getFileName());

            Path backUpFile = Path.of("backup.txt");

            Files.copy(path, backUpFile);
            System.out.println("Backup file created");

            Path backupDirectory = Path.of("Backup");
            Files.createDirectory(backupDirectory);

            Path destination = backupDirectory.resolve("backup.txt");

            Files.move(backUpFile, destination);
            System.out.println("Backup file moved");

            if (Files.exists(path)) {
                System.out.println("Original file exists");
            }

            if (Files.exists(destination)) {
                System.out.println("Backup file exists at: "
                        + destination.toAbsolutePath());
            }

            Files.delete(path);
            Files.delete(destination);
            Files.delete(backupDirectory);

            System.out.println("Files and directory deleted");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
