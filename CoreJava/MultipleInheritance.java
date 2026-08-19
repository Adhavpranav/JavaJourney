package CoreJava;

interface PrinterInterface{
     void printDocs();
}

interface ScannerInterface{
     void scanDocs();
}

class AllInOneMachine implements PrinterInterface,ScannerInterface{
    public void scanDocs(){
        System.out.println("Scanning document");
    }

    @Override
    public void printDocs() {
        System.out.println("Printing document");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        AllInOneMachine obj=new AllInOneMachine();
        obj.printDocs();
        obj.scanDocs();
    }
}
