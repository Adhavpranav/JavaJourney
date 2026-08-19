package CoreJava;

interface LightControl{
    void turnOnLight();
}

interface TemperatureControl{
    void setTemperature();
}

class SmartHome implements LightControl,TemperatureControl{
    @Override
    public void turnOnLight() {
        System.out.println("Light is ON");
    }

    @Override
    public void setTemperature() {
        System.out.println("Temperature set to 24°C");
    }
}

public class SmartHomeInterfaces {
    public static void main(String[] args) {
      SmartHome smartHome =new SmartHome();
      smartHome.turnOnLight();
      smartHome.setTemperature();
    }
}
