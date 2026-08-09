package CoreJava;

public class GettersAndSetters {
        private String name;
        private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return  this.age;
    }

    public String getName(){
        return  this.name;
    }

    public static void main(String[] args) {
        GettersAndSetters obj=new GettersAndSetters();
        obj.setAge(10);
        obj.setName("Ayushi");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
