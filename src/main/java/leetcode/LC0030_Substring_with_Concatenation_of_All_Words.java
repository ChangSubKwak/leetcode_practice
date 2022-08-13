package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0030_Substring_with_Concatenation_of_All_Words {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordCount.put(words[i], wordCount.getOrDefault(words[i], 0) + 1);
        }

        int windowSize = words.length;
        int wordSize = words[0].length();

        Map<String, Integer> windowCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= s.length() - windowSize * wordSize; i++) {
            String startWord = s.substring(i, i + wordSize);
            if (!wordCount.containsKey(startWord)) {
                continue;
            }

            windowCount.clear();
            for (int j = i; j < i + windowSize * wordSize; j += wordSize) {
                String word = s.substring(j, j + wordSize);
                windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
            }

            boolean allMatch = true;
            for (int j = 0; j < words.length; j++) {
                if (!windowCount.containsKey(words[j])) {
                    allMatch = false;
                    break;
                }

                if (!windowCount.get(words[j]).equals(wordCount.get(words[j]))) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                result.add(i);
            }
        }

        return result;
    }

    /*
    public List<Integer> findSubstring(String s, String[] words) {
        final Map<String, Integer> counts = new HashMap<>();
        for (final String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        final List<Integer> indexes = new ArrayList<>();
        final int n = s.length(), num = words.length, len = words[0].length();
        for (int i = 0; i < n - num * len + 1; i++) {
            final Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                final String word = s.substring(i + j * len, i + (j + 1) * len);
                if (counts.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > counts.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == num) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    */
}
