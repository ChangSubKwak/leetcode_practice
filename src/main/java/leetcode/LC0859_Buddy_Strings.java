package leetcode;

public class LC0859_Buddy_Strings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int[] wordCount1 = new int[26];
        int[] wordCount2 = new int[26];
        int differentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            wordCount1[s.charAt(i) - 'a']++;
            wordCount2[goal.charAt(i) - 'a']++;
            if (s.charAt(i) != goal.charAt(i)) {
                differentCount++;
            }

            if (differentCount >= 3) {
                return false;
            }
        }

        if (s.equals(goal)) {
            boolean isReturn = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount1[i] > 1) {
                    isReturn = false;
                    break;
                }
            }
            if (isReturn) {
                return false;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (wordCount1[i] != wordCount2[i]) {
                return false;
            }
        }

        return true;
    }
}
