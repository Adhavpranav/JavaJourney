package FileHandling;

import java.io.*;

public class FileAnalyzer {
    public static void main(String[] args) {
        try{
            File file=new File("data.txt");

            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            FileWriter fileWriter=new FileWriter("analysis.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            int totalNoOfLines=0;
            int totalNoOfWords=0;
            int totalNoOfCharacters=0;
            int longestStringSize=0;

            String longestLineInFile=null;
            String line;

            while ((line=bufferedReader.readLine())!=null){
                totalNoOfLines++;
                totalNoOfWords+=line.split(" ").length;
                totalNoOfCharacters+=line.length();

                if(longestStringSize<line.length()){
                    longestLineInFile=line;
                    longestStringSize=line.length();
                }
            }
            bufferedReader.close();

            bufferedWriter.write("Total Number Of Lines: "+totalNoOfLines+"\nTotal Number Of Words: "+totalNoOfWords+"\nTotal Number Of Characters :"
            +totalNoOfCharacters+"\nLongest Line In File: "+longestLineInFile);

            bufferedWriter.close();

            bufferedReader=new BufferedReader(new FileReader("analysis.txt"));

            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
