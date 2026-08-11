package CoreJava;

import java.util.Scanner;

public class PalindromeString {
    public boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PalindromeString obj=new PalindromeString();

        System.out.println("Enter a string:");
        String str=scanner.nextLine();
        scanner.close();
        if(obj.isPalindrome(str)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}
