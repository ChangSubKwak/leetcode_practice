package leetcode;

import java.util.*;

public class LC0345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        List<Integer> position = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(s.charAt(i))) {
                position.add(i);
            }
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < position.size() / 2; i++) {
            int start = position.get(i);
            int end   = position.get(position.size() - 1 - i);

            char t = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, t);
        }

        return sb.toString();
    }
}
