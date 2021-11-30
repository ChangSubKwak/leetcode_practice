package leetcode;

public class LC0171_Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, j);
        }
        return sum;
    }
}
