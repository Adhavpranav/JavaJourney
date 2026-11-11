package Collection;

import java.util.*;

enum PaymentStatus{
    PENDING,
    SUCCESS,
    FAILED,
    REFUNDED
}

public class EnumSetNoneOf {
    public static void main(String[] args) {
        EnumSet<PaymentStatus> set = EnumSet.noneOf(PaymentStatus.class);
        System.out.println(set);//empty

        set.addAll(EnumSet.of(PaymentStatus.PENDING,PaymentStatus.SUCCESS));
        System.out.println(set);

        System.out.println(set.contains(PaymentStatus.FAILED));
        System.out.println(set.size());
    }
}
