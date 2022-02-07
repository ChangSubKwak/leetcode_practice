package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0389_Find_the_Difference {
    public char findTheDifference(String s, String t) {
        char[] charSArray = s.toCharArray();
        char[] charTArray = t.toCharArray();
        
        Arrays.sort(charSArray);
        Arrays.sort(charTArray);
        
        int length = charSArray.length;
        for (int i = 0; i < length; i++) {
            if (charSArray[i] != charTArray[i]) {
                return charTArray[i];
            }
        }
        return charTArray[length];
    }
}
