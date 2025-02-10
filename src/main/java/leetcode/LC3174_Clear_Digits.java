package leetcode;

public class LC3174_Clear_Digits {
    public String clearDigits(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while (i < sb.length()) {
            if (i >= 1 && Character.isDigit(sb.charAt(i))) {
                sb = new StringBuilder(sb.substring(0, i - 1) + sb.substring(i + 1, sb.length()));
                i--;
                continue;
            }
            i++;
        }

        return sb.toString();
    }
}
