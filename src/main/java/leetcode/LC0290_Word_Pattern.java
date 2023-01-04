package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0290_Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character c = pattern.charAt(i);

            if (!map.containsKey(c) && map.values().contains(words[i])) {
                return false;
            }

            if (pattern.length() != words.length) {
                return false;
            }

            if (!map.containsKey(c)) {
                map.put(c, words[i]);
                continue;
            }

            if (!map.get(c).equals(words[i])) {
                return false;
            }
        }
        return true;
    }
    public boolean wordPattern_V1(String pattern, String s) {
        String[] word = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        
        if (pattern.length() != word.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (map.containsValue(word[i])) {
                   return false;
                }
                
                map.put(c, word[i]);
                continue;
            }
            
            String tempWord = map.get(c);
            if (!tempWord.equals(word[i])) {
                return false;
            }
        }
        
        return true;
    }
}
