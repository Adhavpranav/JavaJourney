package Collection;


import java.util.*;

class Student{
    private int id;
    private String name;
    private double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void display(){
        System.out.println("Student id :"+id);
        System.out.println("Student name :"+name);
        System.out.println("Student marks :"+marks);
    }
}

public class StudentQueue {
    public static void main(String[] args) {

        Student[] obj=new Student[4];

        obj[0]=new Student(1,"Pranav",88);
        obj[1]=new Student(2,"Ayushi",99);
        obj[2]=new Student(3,"Misty",77);
        obj[3]=new Student(4,"Serena",59);

        Queue<Student> queue = new LinkedList<Student>(Arrays.asList(obj));
        Iterator<Student> iterator = queue.iterator();

        System.out.println("All Students: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        iterator = queue.iterator();

        boolean isFound=false;
        while(iterator.hasNext()){
            if(iterator.next().getId()==3){
                isFound=true;
                break;
            }
        }

        if(isFound)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        System.out.println(queue.poll().getName());

        iterator = queue.iterator();
        System.out.println("Remaining Students: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        System.out.println(queue.size());
    }
}
