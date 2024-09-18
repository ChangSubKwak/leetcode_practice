package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0884_Uncommon_Words_from_Two_Sentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arrayString1 = s1.split(" ");
        String[] arrayString2 = s2.split(" ");

        Map<String, Integer> count = new HashMap<>();
        for (String word : arrayString1) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : arrayString2) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.stream()
            .toArray(String[]::new);
    }
}
