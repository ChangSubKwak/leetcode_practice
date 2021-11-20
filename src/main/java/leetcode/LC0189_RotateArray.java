package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0189_RotateArray {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub1 = s.substring(i, i + 10);
            if (set1.contains(sub1)) {
                set2.add(sub1);
                continue;
            }
            set1.add(sub1);
        }
        return new ArrayList<String>(set2);
    }
}
