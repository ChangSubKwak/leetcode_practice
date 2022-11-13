package leetcode;

import java.util.*;
import java.util.stream.*;

public class LC0151_Reverse_Words_in_a_String {

    public String reverseWords(String s) {
        List<String> splitWords = Arrays.stream(s.split(" "))
            .collect(Collectors.toList());

        StringBuilder result = new StringBuilder();
        for (int i = splitWords.size() - 1; i >= 0; i--) {
            String word = splitWords.get(i).trim();
            result.append(word);

            if (i != 0 && word.length() != 0) {
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
    public String reverseWordsV1(String s) {
        String[] splitedWords = s.trim().split(" ");
        int length = splitedWords.length;
        
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if ("".equals(splitedWords[i])) {
                continue;
            }
            
            if (i != 0) {
                sb.append(splitedWords[i] + " ");
                continue;
            }
            sb.append(splitedWords[i]);
        }
        
        return sb.toString();
    }
}
