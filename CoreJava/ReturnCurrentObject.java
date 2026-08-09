package CoreJava;

class EmployeeInfo{
    String name;
    double salary;

    EmployeeInfo(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    EmployeeInfo getEmployee(){
        return this;
    }
}

public class ReturnCurrentObject {
    public static void main(String[] args) {
        EmployeeInfo obj1=new EmployeeInfo("Pranav",2000);
        EmployeeInfo obj2= obj1.getEmployee();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

//        System.out.println(obj1.equals(obj2)); true both pointing to same obj

    }
}
