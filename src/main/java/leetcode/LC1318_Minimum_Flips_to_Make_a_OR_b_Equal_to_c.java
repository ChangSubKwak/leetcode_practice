package leetcode;

public class LC1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    private String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }

    public int minFlips(int a, int b, int c) {
        String s1 = padLeftZeros(Integer.toBinaryString(a), 32);
        String s2 = padLeftZeros(Integer.toBinaryString(b), 32);
        String s3 = padLeftZeros(Integer.toBinaryString(c), 32);

        int count = 0;
        for (int i = 0; i < 32; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            char c3 = s3.charAt(i);

            if (c3 == '0') {
                if (c1 == '1') {
                    count++;
                }
                if (c2 == '1') {
                    count++;
                }
            } else {
                if (c1 == '0' && c2 == '0') {
                    count++;
                }
            }
        }

        return count;
    }
}
