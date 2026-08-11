package CoreJava;
import java.util.*;

public class StringBufferOperations {

    public void operations(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.append(" Java");
        stringBuffer.insert(0,"World ");
        stringBuffer.replace(0,"world".length(),"Awesome");

        int start=stringBuffer.indexOf(" Java");
        stringBuffer.delete(start,start+" Java".length());

        System.out.println("Final String: " + stringBuffer);
      
    }

    public static void main(String[] args) {
        StringBufferOperations obj=new StringBufferOperations();
        String str="Hello";
        obj.operations(str);
    }
}
