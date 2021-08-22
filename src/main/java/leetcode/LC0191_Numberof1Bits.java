package leetcode;

public class LC0191_Numberof1Bits {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    
	public static void main(String[] args) {
		LC0191_Numberof1Bits t = new LC0191_Numberof1Bits();
		System.out.println(t.hammingWeight(11));
	}
}
