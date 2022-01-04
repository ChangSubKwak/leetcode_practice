package leetcode;

public class LC1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60_X {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
                continue;
            }
            sb.setCharAt(i, '1');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}