package leetcode;

public class LC1047_Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        int i = 0;
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int j = 0; j < length; j++, i++) {
            chars[i] = chars[j];
            if (i > 0 && chars[i - 1] == chars[i]) {
                i -= 2;
            }
        }

        return new String(chars, 0, i);
    }
}
