package CoreJava;

class DatabaseConfig{

    static String url;

    static{
        url = "jdbc:mysql://localhost:3306/student";
    }

    static void displayConfig(){
        System.out.println("Database URL: " + url);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        DatabaseConfig.displayConfig();
    }
}
