package CoreJava;

class StudentValues {
    private String name;
    private int age;

    StudentValues(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StudentValues student = (StudentValues) o;
        return age == student.age && name.equals(student.name);
    }
}

public class EqualsDemo {
    public static void main(String[] args) {
        StudentValues studentValues1 =
                new StudentValues("Ayushi", 21);
        StudentValues studentValues2 =
                new StudentValues("Ayushi", 21);
        System.out.println(studentValues1.equals(studentValues2));
    }
}
