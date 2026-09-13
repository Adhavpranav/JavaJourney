package CoreJava;

interface Printable{
    void print();
}

interface Scannable{
    void scan();
}

interface Machine extends  Printable,Scannable{
    void fax();
}

class OfficeMachine implements Machine{
    @Override
    public void print() {
        System.out.println("Office Machine print");
    }
    @Override
    public void scan() {
        System.out.println("Office Machine scan");
    }
    @Override
    public void fax() {
        System.out.println("Office Machine fax");
    }
}

public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        OfficeMachine officeMachine = new OfficeMachine();
        officeMachine.print();
        officeMachine.scan();
        officeMachine.fax();

//        Machine machine = new OfficeMachine();
//        machine.print();
    }
}
