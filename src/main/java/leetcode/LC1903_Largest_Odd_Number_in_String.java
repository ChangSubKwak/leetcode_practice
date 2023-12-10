package leetcode;

public class LC1903_Largest_Odd_Number_in_String {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);

        int length = sb.length();
        while (length > 0) {
            int lastNumber = Integer.valueOf(sb.charAt(length - 1));
            if (lastNumber % 2 == 0) {
                sb.setLength(length - 1);
                length--;
                continue;
            }
            break;
        }

        return sb.toString();
    }
}
