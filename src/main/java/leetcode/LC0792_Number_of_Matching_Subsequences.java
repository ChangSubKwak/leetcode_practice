package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0792_Number_of_Matching_Subsequences {
    public int numMatchingSubseq(String s, String[] words) {
        int answer = 0;
        List<List<StringBuilder>> waiting = new ArrayList<>();
        for (int i = 0; i <= 128; i++) {
            waiting.add(new ArrayList<>());
        }
        
        for (String w : words) {
            waiting.get(w.charAt(0)).add(new StringBuilder(w));
        }
    
        for (char c : s.toCharArray()) {
            List<StringBuilder> advance = new ArrayList<>(waiting.get(c));
            waiting.get(c).clear();
    
            for (StringBuilder it : advance){
                it.deleteCharAt(0);
                if (it.length() != 0) {
                    waiting.get(it.charAt(0)).add(it);
                    continue;
                }
                answer++;
            }
        }
        
        return answer;
    }
}
