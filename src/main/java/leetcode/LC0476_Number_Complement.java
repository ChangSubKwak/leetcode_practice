package leetcode;

public class LC0476_Number_Complement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') sb.append("1");
            else                    sb.append("0");
        }
        int res = Integer.parseInt(sb.toString(),2);
        
        return res;
    }
}
