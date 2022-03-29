package leetcode;

public class LC0151_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
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
