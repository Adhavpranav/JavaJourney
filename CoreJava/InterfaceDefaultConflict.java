package CoreJava;

interface InterfacePrinter2{
    default void start(){
        System.out.println("Printer start");
    }
}

interface InterfaceScanner2{
    default void start(){
        System.out.println("Scanner start");
    }
}

class MultiFunctionMachineClass implements  InterfaceScanner2, InterfacePrinter2{
    @Override
    public void start() {
        //by overriding method the conflict is resolved
        // u cannot this for abstract method Printer.super.start();  they dont have body
        InterfacePrinter2.super.start();
        InterfaceScanner2.super.start();
    }
}

public class InterfaceDefaultConflict {
    public static void main(String[] args) {
        MultiFunctionMachineClass obj = new MultiFunctionMachineClass();
        obj.start();
    }
}
