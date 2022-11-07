package leetcode;

public class LC1323_Maximum_69_Number {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);

        boolean isNotChanged = true;
        for (int i = 0; i < s.length(); i++) {
            if (isNotChanged && s.charAt(i) == '6') {
                isNotChanged = true;
                return Integer.valueOf(s.substring(0, i) + "9" + s.substring(i + 1));
            }
        }

        return Integer.valueOf(s);
    }
}
