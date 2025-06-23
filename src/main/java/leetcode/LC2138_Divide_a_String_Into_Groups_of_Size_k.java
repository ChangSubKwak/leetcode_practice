package leetcode;

public class LC2138_Divide_a_String_Into_Groups_of_Size_k {
    public String[] divideString(String s, int k, char fill) {
        int indexSize = (int)Math.ceil(s.length() * 1.0 / k);
        String[] result = new String[indexSize];

        for (int i = 0; i < indexSize; i++) {
            result[i] = s.substring(i * k, Math.min((i + 1) * k, s.length()));
        }

        String last = result[indexSize - 1];
        for (int i = last.length(); i < k; i++) {
            last += fill;
        }

        result[indexSize - 1] = last;

        return result;
    }
}
