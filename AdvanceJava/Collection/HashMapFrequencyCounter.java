package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapFrequencyCounter {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        String str = "programming";
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        char highestFrequency;
        highestFrequency= map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(highestFrequency);
    }
}
