package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIODirectoryPractice {

    public static void main(String[] args) {

        Path directory = Path.of("ProjectData");

        try {
            Files.createDirectories(directory);
            System.out.println("Directory Created");

            String[] fileNames = {"java.txt", "python.txt", "notes.txt"};

            for (String fileName : fileNames) {
                Path file = directory.resolve(fileName);
                Files.createFile(file);
            }

            String[] fileContent = {
                    "Hello I am first file",
                    "Hello I am second file",
                    "Hello I am third file"
            };

            int index = 0;

            for (String content : fileContent) {
                Path path = directory.resolve(fileNames[index]);
                Files.writeString(path, content);
                index++;
            }

            System.out.println("File list:");

            Files.list(directory)
                    .filter(Files::isRegularFile)
                    .forEach(path -> System.out.println(path.getFileName()));

            System.out.println("\nFile name and its size:");

            Files.list(directory)
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            System.out.println(
                                    path.getFileName() + " : "
                                            + Files.size(path) + " bytes"
                            );
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    });

            Path javaFile = directory.resolve("java.txt");

            System.out.println("\nJava.txt content:");
            System.out.println(Files.readString(javaFile));

            Path javaBackup = directory.resolve("java_backup.txt");

            Files.copy(javaFile, javaBackup);
            System.out.println("Java file copied");

            Path pythonDirectory = directory.resolve("Python");

            Files.createDirectory(pythonDirectory);

            Path pythonFile = directory.resolve("python.txt");
            Path movedPython = pythonDirectory.resolve("python.txt");

            Files.move(pythonFile, movedPython);
            System.out.println("Python file moved");

            if (Files.exists(movedPython)) {
                System.out.println("Python file exists in Backup directory");
            }

            Files.delete(javaFile);
            Files.delete(javaBackup);
            Files.delete(movedPython);
            Files.delete(directory.resolve("notes.txt"));
            Files.delete(pythonDirectory);
            Files.delete(directory);

            System.out.println("All files and directories deleted");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
