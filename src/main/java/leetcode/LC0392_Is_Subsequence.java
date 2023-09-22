package leetcode;

public class LC0392_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int pos1 = 0;
        int pos2 = 0;

        while (pos1 < s.length() && pos2 < t.length()) {
            // System.out.println("pos1 = " + pos1 + " | pos2 = " + pos2);
            if (s.charAt(pos1) == t.charAt(pos2)) {
                pos1++;
                pos2++;
                continue;
            }

            while (pos2 < t.length() && s.charAt(pos1) != t.charAt(pos2)) {
                pos2++;
            }
        }

        return pos1 >= s.length();
    }
}
