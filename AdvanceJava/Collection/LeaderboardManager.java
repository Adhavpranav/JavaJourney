package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderboardManager {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(
                Arrays.asList(450, 200, 800, 650, 300, 800, 550, 200)
        );

        Collections.sort(scores,Collections.reverseOrder());
        System.out.println("Scores: " + scores);

        System.out.println("Highest Score :"+Collections.max(scores));
        System.out.println("Lowest Score :"+Collections.min(scores));

        System.out.println("Frequency of 800 :"+Collections.frequency(scores, 800));

        Collections.swap(scores,0,scores.size()-1);
        System.out.println(scores);
    }
}
