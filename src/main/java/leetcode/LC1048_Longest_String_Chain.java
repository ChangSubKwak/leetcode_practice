package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class LC1048_Longest_String_Chain {
    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int result = 0;
        for (String word : words) {
            int longestLength = 0;
            for (int i = 0; i < word.length(); ++i) {
                String exceptOne = word.substring(0, i) + word.substring(i + 1);
                longestLength = Math.max(longestLength, dp.getOrDefault(exceptOne, 0) + 1);
            }
            dp.put(word, longestLength);
            result = Math.max(result, longestLength);
        }
        return result;
    }
}
