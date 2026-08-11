package CoreJava;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

    void frequencyCount(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println("Each frequency count:");
        for(char key:map.keySet()){
            System.out.println(key+" Frequency Count "+map.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= scanner.nextLine();

        CharacterFrequency obj=new CharacterFrequency();
        obj.frequencyCount(str);
    }
}
