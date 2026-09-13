package CoreJava;

interface InterfacePrinter {
    void start();
//    default void start() {
//        System.out.println("Printer");
//    }
    // same signature of default methods in two interface gives error
    //but void start() works as abstract
}

interface InterfaceScanner {
   void start();
//    default void start() {
//        System.out.println("Scanner");
//    }
}

class MultiFunctionMachine implements  InterfacePrinter, InterfaceScanner {
    @Override
    public void start() {
        System.out.println("MultiFunctionMachine start");
    }
}

public class InterfaceMethodConflict {
    public static void main(String[] args) {
        MultiFunctionMachine multiFunctionMachine=new MultiFunctionMachine();
        multiFunctionMachine.start();

        InterfacePrinter printer = new MultiFunctionMachine();
        InterfaceScanner scanner = new MultiFunctionMachine();

        printer.start();
        scanner.start();
    }
}
