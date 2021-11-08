package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                set.add((char)('a' + i));
            }
        }
        
        if (set.size() == 0) {
            return -1;
        }
        
        int min = 100001;
        for (char c : set) {
            int index = s.indexOf(c);
            if (min > index) {
                min = index;
            }
        }
        return min;
    }
}
