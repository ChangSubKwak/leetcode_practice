package leetcode;

public class LC0443_String_Compression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while(pos + 1 < chars.length) {
            int count = 1;
            while (pos + 1 < chars.length && chars[pos] == chars[pos + 1]) {
                count++;
                pos++;
            }
            sb.append(chars[pos]);
            if (count != 1) {
                sb.append(count);
            }
            pos++;
        }

        if (pos < chars.length) {
            sb.append(chars[pos]);
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
