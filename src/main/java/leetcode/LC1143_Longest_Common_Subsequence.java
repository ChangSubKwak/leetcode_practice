package leetcode;

public class LC1143_Longest_Common_Subsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] m = new int[1001][1001];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                m[i + 1][j + 1] = (text1.charAt(i) == text2.charAt(j)) ? m[i][j] + 1 : Math.max(m[i + 1][j], m[i][j + 1]);
            }
        }
        return m[text1.length()][text2.length()];
    }
}
