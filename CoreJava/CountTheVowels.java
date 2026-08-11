package CoreJava;
import java.util.*;

public class CountTheVowels {

    public int countTheNumberOfVowels(String str){
        int countVowels=0;
        for(int i=0;i<str.length();i++){
            char currentCharacter=str.charAt(i);
            
            if((currentCharacter=='A'|| currentCharacter=='E'||currentCharacter=='I'||currentCharacter=='O'||currentCharacter=='U')||
            currentCharacter=='a'||currentCharacter=='e'||currentCharacter=='i'||currentCharacter=='o'||currentCharacter=='u'){
                countVowels++;
            }
        }
        return countVowels;
    }

    public static void main(String[] args) {

        CountTheVowels obj=new CountTheVowels();
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a String:");
        String str= scanner.nextLine();

        System.out.println("Number of vowels: "+obj.countTheNumberOfVowels(str));
    }
}
