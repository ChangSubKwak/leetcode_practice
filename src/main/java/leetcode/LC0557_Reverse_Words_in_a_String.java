package leetcode;

public class LC0557_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        String[] splits = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (String split : splits) {
            StringBuilder sb = new StringBuilder(split);
            result.append(sb.reverse()).append(" ");
        }
        
        return result.substring(0, result.length() - 1);
    }
}
