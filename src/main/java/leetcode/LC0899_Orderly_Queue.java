package leetcode;

import java.util.*;

public class LC0899_Orderly_Queue {

    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        String result = s;
        for (int i = 1; i < s.length(); i++) {
            String combined = s.substring(i) + s.substring(0, i);
            if (result.compareTo(combined) > 0) {
                result = combined;
            }
        }

        return result;
    }
}
