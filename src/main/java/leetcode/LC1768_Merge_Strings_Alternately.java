package leetcode;

public class LC1768_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int lessLength = length1 < length2 ? length1 : length2;

        for (int i = 0; i < lessLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if (length1 < length2) {
            for (int i = length1; i < length2; i++) {
                result.append(word2.charAt(i));
            }
            return result.toString();
        }

        if (length2 < length1) {
            for (int i = length2; i < length1; i++) {
                result.append(word1.charAt(i));
            }
            return result.toString();
        }

        return result.toString();
    }
}
