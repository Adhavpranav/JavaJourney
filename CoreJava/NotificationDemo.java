package CoreJava;

interface Notification{
    void send(String message);
}

class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}

class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}

class WhatsAppNotification implements  Notification{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        EmailNotification emailNotification=new EmailNotification();
        SMSNotification smsNotification=new SMSNotification();
        WhatsAppNotification whatsAppNotification=new WhatsAppNotification();

        emailNotification.send("Hello Email");
        smsNotification.send("Hello Sms");
        whatsAppNotification.send("Hello WhatsApp");
    }
}
