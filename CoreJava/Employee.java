package CoreJava;

class Employee{

    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(){
        id=0;
        name="Unknown";
        department="Not Assigned";
        salary=0;
    }

    Employee(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    Employee(Employee obj){
        this.id= obj.id;
        this.name=obj.name;
        this.department=obj.department;
        this.salary=obj.salary;
    }

    Employee(int id,String name){
        this.id=id;
        this.name=name;
        this.department="Not Assigned";
        this.salary=0;
    }

    public void display(){
        System.out.println("Id"+id);
        System.out.println("Name"+name);
        System.out.println("Department"+department);
        System.out.println("Salary:"+salary);
        System.out.println();
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
}

public class EmployeeConstructorSystem {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Employee obj2=new Employee(1,"Pranav","Backend",50000);
        Employee obj3=new Employee(obj2);
        Employee obj4=new Employee(2,"Ayushi");

        obj2.setSalary(1000);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
