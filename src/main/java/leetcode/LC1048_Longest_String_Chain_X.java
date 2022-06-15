package leetcode;

import java.util.*;

public class LC1048_Longest_String_Chain_X {
    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); ++i) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }
}
