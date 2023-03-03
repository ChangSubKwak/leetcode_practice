package util;

import java.util.*;

public class KMP_Algorithm {
    public List<Integer> getPi(String pattern) {
        int lengthOfPattern = pattern.length();
        int j = 0;

        List<Integer> pi = new ArrayList<>();
        for (int i = 0; i < lengthOfPattern; i++) {
            pi.add(0);
        }

        for (int i = 1; i < lengthOfPattern; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi.get(j - 1);
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                pi.set(i, j);
            }
        }

        return pi;
    }
}
