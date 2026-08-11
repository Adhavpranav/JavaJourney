package CoreJava;
import java.util.*;

public class ReverseString {
    public String reverseString(String str){
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
         return stringBuilder.toString();
//       return stringBuilder.reverse().toString(); this also works
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ReverseString obj=new ReverseString();

        String str;
        System.out.print("Enter a string:");
        str=scanner.nextLine();
        System.out.println("Reverse String:"+obj.reverseString(str));
    }
}
