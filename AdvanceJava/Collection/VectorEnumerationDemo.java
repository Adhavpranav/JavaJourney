package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        String[] language={"Java","Python","C++","JavaScript","Go"};

        Collections.addAll(vector, language);

        Enumeration<String> enumeration = vector.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Total elements: "+vector.size());
    }
}
