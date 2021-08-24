package leetcode;

public class LC0190_ReverseBits {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
    
	public static void main(String[] args) {
		LC0190_ReverseBits t = new LC0190_ReverseBits();
		System.out.println(t.reverseBits(43261596)); 
	}
}
