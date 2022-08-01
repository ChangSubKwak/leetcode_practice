package leetcode;

import java.util.*;

public class LC0914_Word_Subsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<Map<String, Integer>> list = new ArrayList<>();
        for (int i = 0; i < words1.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < words1[i].length(); j++) {
                char ch = words1[i].charAt(j);
                map.put(ch + "", map.getOrDefault(ch + "", 0) + 1 );
            }
            list.add(map);
        }

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < words2.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < words2[i].length(); j++) {
                char ch = words2[i].charAt(j);
                map.put(ch + "", map.getOrDefault(ch + "", 0) + 1 );
            }

            for (String key: map.keySet()) {
                if (target.containsKey(key)) {
                    target.put(key, Math.max(target.get(key), map.get(key)));
                    continue;
                }
                target.put(key, map.get(key));
            }
        }


        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Map<String, Integer> source = list.get(i);

            boolean isMatched = true;
            for (String key : target.keySet()) {
                if (source.get(key) == null || source.get(key) < target.get(key)) {
                    isMatched = false;
                    break;
                }
            }

            if (isMatched) {
                result.add(words1[i]);
            }
        }

        return result;
    }
}
