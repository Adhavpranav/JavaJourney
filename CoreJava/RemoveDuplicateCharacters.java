package CoreJava;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public String removeDuplicates(String str) {
       StringBuffer stringBuffer=new StringBuffer();
       int[] arr =new int[26];

       for(int i=0;i<str.length();i++){
           int index=str.charAt(i)-'a';
           if(arr[index]==0){
               stringBuffer.append(str.charAt(i));
           }
           arr[index]++;
       }
       return stringBuffer.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateCharacters obj=new RemoveDuplicateCharacters();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a string:");
        String str=scanner.nextLine();

        System.out.println("After removing duplicate: "+obj.removeDuplicates(str));
    }
}
