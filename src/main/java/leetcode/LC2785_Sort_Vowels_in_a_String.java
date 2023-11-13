package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC2785_Sort_Vowels_in_a_String {
    public String sortVowels(String s) {
        int[][] count = new int[2][5];
        List<Character> upperVowels = Arrays.asList('A', 'E', 'I', 'O', 'U');
        List<Character> lowerVowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (upperVowels.contains(c)) {
                count[0][upperVowels.indexOf(c)]++;
            }
            else if (lowerVowels.contains(c)) {
                count[1][lowerVowels.indexOf(c)]++;
            }
        }
        
        List<Character> result = s.chars()
            .mapToObj(e -> (char)e)
            .collect(Collectors.toList());
        
        int position = 0;
        while (position < result.size()) {
            char c = result.get(position);
            if (upperVowels.contains(c) || lowerVowels.contains(c)) {
                boolean isExist = false;
                for (int i = 0; !isExist && i < 5; i++) {
                    if (count[0][i] > 0) {
                        result.set(position, upperVowels.get(i));
                        count[0][i]--;
                        isExist = true;
                        
                    }
                }
                
                for (int i = 0; !isExist && i < 5; i++) {
                    if (count[1][i] > 0) {
                        result.set(position, lowerVowels.get(i));
                        count[1][i]--;
                        isExist = true;
                    }
                }
                
                if (!isExist) {
                    return result.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining());
                }
            }
            position++;
        }
        
        return result.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
