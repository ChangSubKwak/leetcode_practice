package leetcode;

public class LC0344_Reverse_String {
    public void reverseString(char[] s) {
        char t;
        for(int i = 0; i < s.length / 2; i++) {
            t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
        }
    }
}
