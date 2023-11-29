package leetcode;

public class LC0191_Number_of_1_Bits {
    
    public int hammingWeight(int n) {
        int num = n;
        StringBuilder sb = new StringBuilder();
        if (n > 0) {
            while (num > 0) {
                sb.append(num % 2);
                num /= 2;
            }
        } else if (n < 0) {
            num = Math.abs(n);
            num--;
            while (num > 0) {
                sb.append(num % 2);
                num /= 2;
            }
            int needZeroCount = 32 - sb.length();
            for (int i = 0; i < needZeroCount; i++) {
                sb.append(0);
            }
            int count = 0;
            for (int i = 0; i < 32; i++) {
                if (sb.charAt(i) == '0') {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
        
        int count = 0;
        for (char c : sb.toString().toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        
        return count;
    }
    
    public int hammingWeight2(int n) {
        long newNum = n;
        if (n < 0) {
            newNum = 0;
            newNum += Integer.MAX_VALUE;
            newNum += Integer.MAX_VALUE;
            newNum += 2;
            newNum += n;
        }
        
        long r;
        int count = 0;
        while(newNum != 0) {
            r = newNum % 2L;
            if (r == 1) {
                count++;
            }
            newNum /= 2L;
        }
        
        return count;
    }

    public int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }
}
