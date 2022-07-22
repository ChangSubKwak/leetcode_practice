package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC0792_Number_of_Matching_Subsequences {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            map.put(word, 0);
            if (countMap.containsKey(word)) {
                countMap.put(word, countMap.get(word) + 1);
                continue;
            }
            countMap.put(word, 1);
        }
        
        Set<String> resultSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            Set<String> keys = new HashSet<>(map.keySet());
            for (String word : keys) {
                if (resultSet.contains(word)) {
                    continue;
                }
                
                int pos = map.get(word);
                if (pos < word.length() && c == word.charAt(pos)) {
                    map.put(word, map.get(word) + 1);
                }
                
                if (word.length() == map.get(word)) {
                    map.remove(word);
                    resultSet.add(word);
                }
            }
        }
        
        int count = 0;
        for (String s2: resultSet) {
            count += countMap.get(s2);
        }
        
        return count;
    }
}
