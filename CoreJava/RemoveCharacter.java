package CoreJava;

import java.util.Scanner;

public class RemoveCharacter {
    public String removeCharacter(String str,char target){
        StringBuffer stringBuffer=new StringBuffer(str);
//        for(int i=0;i<str.length();i++) { it can also works
//            if (str.charAt(i)!=target)
//                stringBuffer.append(str.charAt(i));
//        }
        for(int i=0;i<stringBuffer.length();i++){
            if(stringBuffer.charAt(i)==target){
                stringBuffer.deleteCharAt(i);
                i--;
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RemoveCharacter obj=new RemoveCharacter();
        System.out.println("Enter a string:");
        String str=scanner.nextLine();
        System.out.println("Enter a character to remove:");
        char ch=scanner.next().charAt(0);
        System.out.println("After removing character:"+obj.removeCharacter(str,ch));
    }
}
