package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC1048_Longest_String_Chain {
    private List<List<String>> result;

    private void recur(String[] words, int i) {

    }

    public int longestStrChain(String[] words) {
        int length = words.length;

        for (int i = 0; i < length; i++) {
            result.add(new ArrayList<>());
            recur(words, i);
        }

        return 4;
    }
}
