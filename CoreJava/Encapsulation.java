package CoreJava;

public class Encapsulation {
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  this.name;
    }

    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setName("Pranav");
        System.out.println(obj.getName());
    }
}
