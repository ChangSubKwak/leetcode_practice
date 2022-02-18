package leetcode;

public class LC0402_Remove_K_Digits_X {
    public String removeKdigits(String num, int k) {
        int index;
        StringBuilder sb = new StringBuilder(num);
        while (k > 0) {
            int length = sb.length();
            index = 0;
            while (index + 1 < length && sb.charAt(index) <= sb.charAt(index+1)) {
                index++;
            }
            sb.deleteCharAt(index);
            k--;
        }
        
        index = 0;
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
