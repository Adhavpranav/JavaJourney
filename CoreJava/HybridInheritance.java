package CoreJava;

class Appliance{
    protected void powerOn(){
        System.out.println("Appliance is powered on");
    }
}

class WashingMachine extends Appliance{
    protected void wash(){
        System.out.println("Washing clothes");
    }
}

class Refrigerator extends Appliance{
    protected void cool(){
        System.out.println("Refrigerator is cooling");
    }
}

interface SmartControl{
    void connectWiFi();
}

class SmartRefrigerator extends Refrigerator implements SmartControl{
    @Override
    public void connectWiFi() {
        System.out.println("Connected to WiFi");
    }
    protected void displayInfo(){
        System.out.println("Smart refrigerator is ready");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        SmartRefrigerator smartRefrigerator=new SmartRefrigerator();
        smartRefrigerator.powerOn();
        smartRefrigerator.cool();
        smartRefrigerator.connectWiFi();
        smartRefrigerator.displayInfo();
    }
}
