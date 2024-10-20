package leetcode;

public class LC1106_Parsing_A_Boolean_Expression {
    public boolean parseBoolExpr(String expression) {
        int length = expression.length();
        for (int i = 0; i < length; i++) {
            char c = expression.charAt(i);
            if (c == '!' || c == '&' || c == '|') {

            }
        }

        return false;
    }
}
