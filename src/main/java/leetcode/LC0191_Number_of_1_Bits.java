package leetcode;

public class LC0191_Number_of_1_Bits {
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
