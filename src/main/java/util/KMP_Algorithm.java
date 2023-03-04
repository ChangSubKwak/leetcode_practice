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

    public int strStr(String haystack, String needle) {
        List<Integer> pi = getPi(needle);

        int lengthOfHaystack = haystack.length();
        int lengthOfPattern = needle.length();

        int lengthOfMatched = 0;

        for (int i = 0 ; i < lengthOfHaystack ; i++) {
            while (lengthOfMatched > 0 && haystack.charAt(i) != needle.charAt(lengthOfMatched)) {
                lengthOfMatched = pi.get(lengthOfMatched - 1);
            }

            boolean isMatched = haystack.charAt(i) == needle.charAt(lengthOfMatched);
            
            if (isMatched && lengthOfMatched == lengthOfPattern - 1) {
                return i - lengthOfPattern + 1;
            }

            if (isMatched) {
                lengthOfMatched++;
            }
        }
        return -1;
    }
}
