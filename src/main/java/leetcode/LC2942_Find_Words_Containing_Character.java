package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC2942_Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (x == words[i].charAt(j)) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}
