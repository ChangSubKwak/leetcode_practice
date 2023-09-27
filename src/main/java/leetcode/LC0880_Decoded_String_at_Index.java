package leetcode;

public class LC0880_Decoded_String_at_Index {
    public String decodeAtIndex(String s, int k) {
        int i;

        long length = 0;
        for (i = 0; length < k; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                length *= c - '0';
            } else {
                length++;
            }
        }

        for (i--; i > 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                int number = s.charAt(i) - '0';
                length = length / number;
                k %= length;
                continue;
            }

            if (k % length == 0) {
                break;
            }

            length--;
        }

        return s.charAt(i) + "";
    }
}
