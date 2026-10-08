package CoreJava;

public class WrapperDemo {
    public static void main(String[] args) {
        int num=10;
        double d=17.5;
        char c='P';
        boolean bool=true;

        // this is autoboxing
        //java auto convert primitive to Wrapper class
        Integer integer=num;
        Double double1=d;
        Character character=c;
        Boolean boolean1=bool;

        System.out.println(integer.getClass()+"Value "+integer);
        System.out.println(double1.getClass()+"Value "+double1);
        System.out.println(character.getClass()+"Value "+character);
        System.out.println(boolean1.getClass()+"Value "+boolean1);

        //Unboxing
        int value1=integer;
        System.out.println(value1);

        double value2=double1;
        System.out.println(value2);

        
    }
}
