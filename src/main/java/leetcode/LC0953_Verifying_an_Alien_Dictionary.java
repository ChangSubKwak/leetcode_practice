package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC0953_Verifying_an_Alien_Dictionary {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        String[] newWords = Arrays.copyOfRange(words, 0, words.length);
        Arrays.sort(newWords, (w1, w2) -> {
            int l1 = w1.length();
            int l2 = w2.length();
            int lessLength = l1 < l2 ? l1 : l2;

            for (int i = 0; i < lessLength; i++) {
                if (orderMap.get(w1.charAt(i)) != orderMap.get(w2.charAt(i))) {
                    return orderMap.get(w1.charAt(i)) - orderMap.get(w2.charAt(i));
                }
            }

            return l1 - l2;
        });

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(newWords[i])) {
                return false;
            }
        }

        return true;
    }
}
