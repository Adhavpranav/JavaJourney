package Collection;

import java.util.EnumSet;

enum OperatingSystem{
    WINDOWS,LINUX,MAC,ANDROID,IOS
}

public class EnumSetAllOf {
    public static void main(String[] args) {
        EnumSet<OperatingSystem> set = EnumSet.allOf(OperatingSystem.class);
        System.out.println(set);

        set.remove(OperatingSystem.ANDROID);
        System.out.println(set);

        System.out.println(set.size());
    }
}
