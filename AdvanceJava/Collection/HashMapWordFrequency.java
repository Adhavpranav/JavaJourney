package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapWordFrequency {
    public static void main(String[] args) {
        String sentence = "java is powerful and java is popular";
        String[] words = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int highestFrequency=0;
        String highestWord="";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(highestFrequency<entry.getValue()) {
                highestFrequency=entry.getValue();
                highestWord=entry.getKey();
            }
        }

        System.out.println(highestWord);
    }
}
