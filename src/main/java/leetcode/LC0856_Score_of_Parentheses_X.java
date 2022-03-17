package leetcode;

public class LC0856_Score_of_Parentheses_X {
    public int scoreOfParentheses(String s) {
        int result = 0;
        int c = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c *= 2;
            } else {
                c /= 2;
                if (s.charAt(i - 1) == '(') {
                	result += c;
                }
            }
        }
        
        return Integer.valueOf(result);
    }
}
