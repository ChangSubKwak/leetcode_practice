package leetcode;

public class LC0201_BitwiseANDofNumbersRange_X {
    public int rangeBitwiseAnd(int left, int right) {
    	while (left < right) {
    		right &= right -1;
    	}
    	return left & right;
    }

	public static void main(String[] args) {
		LC0201_BitwiseANDofNumbersRange_X t = new LC0201_BitwiseANDofNumbersRange_X();
		System.out.println(t.rangeBitwiseAnd(5, 7));
		System.out.println(t.rangeBitwiseAnd(0, 0));
		System.out.println(t.rangeBitwiseAnd(1, 2147483647));
	}
}
