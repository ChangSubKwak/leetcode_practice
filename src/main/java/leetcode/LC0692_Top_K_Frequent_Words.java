package leetcode;

import java.util.*;

public class LC0692_Top_K_Frequent_Words {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<Integer, Set<String>> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < words.length; i++) {
            countMap.put(words[i], countMap.getOrDefault(words[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> e: countMap.entrySet()) {
            Set<String> wordSet = new TreeSet<>();
            if (map.containsKey(e.getValue())) {
                wordSet = map.get(e.getValue());
            }

            wordSet.add(e.getKey());
            map.put(e.getValue(), wordSet);
        }

        List<String> result = new ArrayList<>();
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, Set<String>> mapEntry = (Map.Entry)i.next();
            result.addAll(mapEntry.getValue());
        }

        return result.subList(0, k);
    }
}
