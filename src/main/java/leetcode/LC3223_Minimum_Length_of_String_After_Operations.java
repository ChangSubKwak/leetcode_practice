package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC3223_Minimum_Length_of_String_After_Operations {
    public int minimumLength(String s) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        int deleteCount = 0;
        for (int frequency : charFrequencyMap.values()) {
            if (frequency % 2 == 1) {
                deleteCount += frequency - 1;
                continue;
            }

            deleteCount += frequency - 2;
        }

        return s.length() - deleteCount;
    }
}
