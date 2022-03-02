package leetcode;

public class LC0392_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        
        int[] sc = new int[26];
        int[] tc = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            sc[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            tc[t.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (sc[i] > tc[i]) {
                return false;
            }
        }
        
        int si = 0;
        int ti = 0;
        
        while(si < s.length() && ti < t.length()) {
            //char sch = s.charAt(si);
            while(ti < t.length() && s.charAt(si) != t.charAt(ti)) {
                ti++;
            }
            si++;
        }
        
        if (ti >= t.length()) {
            return false;
        }
        
        return true;
    }
}
