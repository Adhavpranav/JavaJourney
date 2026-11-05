package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class StudentClass{
    private String name;
    private double marks;

    StudentClass(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public  String getName() {
        return  name;
    }

    public double getMarks() {
        return marks;
    }

}

public class PriorityQueueStudent {
    public static void main(String[] args) {

        Comparator<StudentClass> comparator = Comparator.comparingDouble(StudentClass::getMarks).reversed();
        PriorityQueue<StudentClass> pq = new PriorityQueue<>(comparator);

        pq.add(new StudentClass("Rahul",85));
        pq.add(new StudentClass("Aman",95));
        pq.add(new StudentClass("Priya",72));
        pq.add(new StudentClass("Neha",90));
        pq.add(new StudentClass("Karan",60));

        assert pq.peek() != null;
        System.out.println(pq.peek().getName());

        while(!pq.isEmpty()){
            System.out.println(pq.poll().getName());
        }

    }
}
