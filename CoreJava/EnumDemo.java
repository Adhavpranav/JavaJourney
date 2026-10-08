package CoreJava;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumDemo{
    public static void main(String[] args) {
        Day today=Day.FRIDAY;
        System.out.println(today);

        System.out.println("All Days");
        for(Day day:Day.values()){
            System.out.println(day);
        }

        Day day=Day.valueOf("SUNDAY");
        System.out.println(day);

        System.out.println(Day.FRIDAY.ordinal());

        System.out.println(Day.FRIDAY.name());
    }
}
