package Collection;

import java.util.Vector;

public class VectorLegacyMethods {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.addElement("Java");
        vector.addElement("Python");
        vector.addElement("C++");

        vector.insertElementAt("Javascript",1);
        System.out.println("Element at index 2 :"+vector.elementAt(2));
        vector.setElementAt("Spring",0);

        vector.removeElement("Python");

        System.out.println("First element: "+vector.firstElement());
        System.out.println("Last element: "+vector.lastElement());

        System.out.println(vector);
    }
}
