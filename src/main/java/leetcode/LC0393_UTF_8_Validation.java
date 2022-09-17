package leetcode;

public class LC0393_UTF_8_Validation {
    public boolean validUtf8(int[] data) {
        int length = data.length;
        int i = 0;

        while (i < length) {
            if ((data[i] & 0x80) == 0x00) {
                i++;
                continue;
            }

            if ((i + 1 < length) && ((data[i] & 0xE0) == 0xC0) && ((data[i + 1] & 0xC0) == 0x80)) {
                i += 2;
                continue;
            }

            if ((i + 2 < length) && ((data[i] & 0xF0) == 0xE0) && ((data[i + 1] & 0xC0) == 0x80) && ((data[i + 2] & 0xC0) == 0x80)) {
                i += 3;
                continue;
            }

            if ((i + 3 < length) && ((data[i] & 0xF8) == 0xF0) && ((data[i + 1] & 0xC0) == 0x80) && ((data[i + 2] & 0xC0) == 0x80) && ((data[i + 3] & 0xC0) == 0x80)) {
                i += 4;
                continue;
            }
            return false;
        }

        return true;
    }
}
