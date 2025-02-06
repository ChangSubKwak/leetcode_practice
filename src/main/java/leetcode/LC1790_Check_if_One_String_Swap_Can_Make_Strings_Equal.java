package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public boolean areAlmostEqual(String s1, String s2) {
        int length = s1.length();
        int countIfDifference = 0;

        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for (int i = 0; i < length; i++) {
            count1.put(s1.charAt(i), count1.getOrDefault(s1.charAt(i), 0) + 1);
            count2.put(s2.charAt(i), count2.getOrDefault(s2.charAt(i), 0) + 1);

            if (s1.charAt(i) != s2.charAt(i)) {
                countIfDifference++;
            }

            if (countIfDifference > 2) {
                return false;
            }
        }

        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            if (count1.get(c) != count2.get(c)) {
                return false;
            }
        }

        return true;
    }
}
