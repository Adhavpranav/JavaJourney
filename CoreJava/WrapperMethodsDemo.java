package CoreJava;

public class WrapperMethodsDemo {
    public static void main(String[] args) {
        String num="123";
        int convertedNumber=Integer.parseInt(num);
        System.out.println(convertedNumber+10);

        String doub="17.5";
        double convertedDouble=Double.parseDouble(doub);
        System.out.println(convertedDouble);

//        String stringNumber=String.valueOf(convertedDouble);
        String stringNumber=Integer.toString(convertedNumber);
        System.out.println(stringNumber+10);

        Integer obj1=10;
        Integer obj2=10;
        Integer obj3=20;
        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj1.compareTo(obj3));

        if(obj1 == obj3)
            System.out.println("same");
        else
            System.out.println("different");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));

        System.out.println(obj1.intValue());
    }
}
