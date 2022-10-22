package leetcode;

import java.util.*;

public class LC0076_Minimum_Window_Substring_X2 {
    public String minWindow(String s, String t) {
        int missing = t.length();
        Map<Character, Integer> need = new HashMap<>();
        for (Character c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        int i = 0;
        for (int j = 1; j <= s.length(); j++) {
            char c = s.charAt(j - 1);
            if (need.getOrDefault(c, 0) > 0) {
                missing--;
            }

            need.put(c, need.getOrDefault(c, 0) - 1);
            if (missing == 0) {
                while (i < j && need.get(s.charAt(i)) < 0) {
                    need.put(s.charAt(i), need.get(s.charAt(i)) + 1);
                    i++;
                }
                need.put(s.charAt(i), need.get(s.charAt(i)) + 1);
                missing++;

                if (end == 0 || (j - i < end - start)) {
                    start = i;
                    end = j;
                }
                i++;
            }
        }
        return s.substring(start, end);
    }
}
