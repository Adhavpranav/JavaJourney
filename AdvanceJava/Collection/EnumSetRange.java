package Collection;

import java.util.EnumSet;

enum Priority{
    LOW, MEDIUM, HIGH, CRITICAL, URGENT
}

public class EnumSetRange {
    public static void main(String[] args) {
        EnumSet<Priority>enumSet = EnumSet.range(Priority.MEDIUM,Priority.CRITICAL);
        System.out.println(enumSet);

        System.out.println(enumSet.contains(Priority.HIGH));//true
        System.out.println(enumSet.contains(Priority.LOW));//false
    }
}
