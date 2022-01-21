package leetcode;

import java.util.List;

public class LC0139_Word_Break_X {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] pos = new boolean[s.length() + 1];
        pos[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j < s.length(); j++) {
                if (pos[j] && wordDict.contains(s.substring(j, i))) {
                    pos[i] = true;
                }
            }
        }
        
        return pos[s.length()];
    }
}
