package CoreJava;

class EmployeeDetails{
    protected  String name="Ayushi";
    protected void work(){
        System.out.println(name+" is working");
    }
}

class Developer extends EmployeeDetails{
    protected String language="Java";
    protected  void code(){
        System.out.println("Developer codes in"+language);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Developer obj=new Developer();
        obj.work();
        obj.code();
    }
}
