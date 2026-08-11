package CoreJava;

import java.util.Scanner;

public class CountWords {
    public int solution(String str){
        int counter=0;
        String newString=str.trim();
        if(newString.isEmpty())
            return counter;
        counter=1;
        for(int i=0;i<newString.length()-1;i++){
            if(Character.isWhitespace(newString.charAt(i)) && Character.isLetterOrDigit(newString.charAt(i+1))){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CountWords obj=new CountWords();

        System.out.println("Enter a string:");
        String str=scanner.nextLine();

        System.out.println("Total words:"+obj.solution(str));
    }
}
