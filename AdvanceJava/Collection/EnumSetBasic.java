package Collection;

import java.util.EnumSet;

enum Browser{
    CHROME,FIREFOX,EDGE,SAFARI
}

public class EnumSetBasic {
    public static void main(String[] args) {
        EnumSet<Browser> enumSet = EnumSet.of(Browser.CHROME,Browser.FIREFOX);
        System.out.println(enumSet);

        enumSet.add(Browser.EDGE);
        System.out.println(enumSet);
        System.out.println(enumSet.contains(Browser.SAFARI));
    }
}
