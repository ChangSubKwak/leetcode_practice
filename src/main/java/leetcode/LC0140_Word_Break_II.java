package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0140_Word_Break_II {
    private List<String> result = new ArrayList<>();
    
    public void recursive(String s, List<String> wordDict, String constructed) {
        if (s.length() == 0) {
            result.add(constructed.trim());
            return;
        }
        
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if (s.startsWith(word)) {
                recursive(s.substring(word.length()), wordDict, constructed + " " + word);
            }
        }
    }
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        recursive(s, wordDict, "");
        return result;
    }
}
