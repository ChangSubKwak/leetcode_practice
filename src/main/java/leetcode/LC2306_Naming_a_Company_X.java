package leetcode;

import java.util.*;

public class LC2306_Naming_a_Company_X {
    public long distinctNames(String[] ideas) {
        Set<String>[] count = new HashSet[26];
        for (int i = 0; i < 26; ++i) {
            count[i] = new HashSet<>();
        }

        for (String s : ideas) {
            count[s.charAt(0) - 'a'].add(s.substring(1));
        }

        System.out.println(Arrays.toString(count));

        long res = 0;
        for (int i = 0; i < 26; ++i) {
            for (int j = i + 1; j < 26; ++j) {
                long c1 = 0, c2 = 0;
                for (String c : count[i]) {
                    if (!count[j].contains(c)) {
                        c1++;
                    }
                }

                for (String c : count[j]) {
                    if (!count[i].contains(c)) {
                        c2++;
                    }
                }
                res += c1 * c2;
            }
        }
        return res * 2;
    }
}
