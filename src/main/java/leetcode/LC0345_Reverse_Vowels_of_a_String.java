package leetcode;

import java.util.*;

public class LC0345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            while(start < s.length() && !set.contains(s.charAt(start))) {
                start++;
            }

            while(end >= 0 && !set.contains(s.charAt(end))) {
                end--;
            }

            if (0 <= start && start < s.length() && 0 <= end && end < s.length()) {
                sb.setCharAt(start, s.charAt(end));
                sb.setCharAt(end, s.charAt(start));
                start++;
                end--;
            }
        }

        return sb.toString();
    }
}
