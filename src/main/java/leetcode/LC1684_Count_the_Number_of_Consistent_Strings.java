package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC1684_Count_the_Number_of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedCharacterSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedCharacterSet.add(c);
        }

        int count = 0;
        for (String word: words) {
            Set<Character> wordSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordSet.add(c);
            }
            if (allowedCharacterSet.containsAll(wordSet)) {
                count++;
            }
        }

        return count;
    }
}
