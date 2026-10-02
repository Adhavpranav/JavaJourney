package FileHandling;

import java.io.*;
import java.util.Scanner;

public class LogAnalyzer {
    public static void main(String[] args) {

        int countInfo=0;
        int countWarning=0;
        int countError=0;

        File file = new File("app.log");
        File result=new File("result.txt");

        try{
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line;
            String mostFrequentError;
            final int totalLogEntries;
            int numberOfLines=0;
            int numberOfWords=0;

            while ((line=bufferedReader.readLine())!=null){

                numberOfWords+=line.trim().split(" ").length;
                numberOfLines++;
                if(line.startsWith("INFO")){
                    countInfo++;
                } else if (line.startsWith("WARNING")) {
                    countWarning++;
                } else if (line.startsWith("ERROR")) {
                    countError++;
                }
            }

            bufferedReader.close();

            totalLogEntries=countInfo+countWarning+countError;

            PrintWriter printWriter=new PrintWriter(result);
            printWriter.println("Total entries :"+totalLogEntries);
            printWriter.println("INFO :"+countInfo);
            printWriter.println("WARNING :"+countWarning);
            printWriter.println("ERROR :"+countError);

            printWriter.close();

            mostFrequentError=helper(file);

            System.out.println("File Statistics");

            System.out.println("File size :"+file.length());
            System.out.println("Number of lines :"+numberOfLines);
            System.out.println("Number of words :"+numberOfWords);
            System.out.println("Most Frequent Error :"+mostFrequentError);

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter keyword:");
            String keyword=scanner.next();

            File tempFile=searchLogByKeyword(file,keyword);

            System.out.println("Result:");
            scanner=new Scanner(tempFile);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException  e){
            System.out.println("Error "+e.getMessage());
        }

    }

    static String helper(File file) throws IOException {
        Scanner scanner = new Scanner(file);

        String candidate = null;
        int count = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (!line.startsWith("ERROR")) {
                continue;
            }

            if (count == 0) {
                candidate = line;
                count = 1;
            } else if (candidate.equals(line)) {
                count++;
            } else {
                count--;
            }
        }
        scanner.close();
        return candidate;
    }

    static File searchLogByKeyword(File file,String keyword)throws  IOException{

        File resultFile=new File("search_result.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(resultFile));

        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line;
        while((line=bufferedReader.readLine())!=null){
            if(line.contains(keyword)){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }

        bufferedReader.close();
        bufferedWriter.close();

        return  resultFile;
    }
}
