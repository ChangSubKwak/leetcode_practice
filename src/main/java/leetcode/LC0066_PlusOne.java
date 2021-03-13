package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class LC0066_PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        LinkedList<Integer> list = new LinkedList<>();
        int carry = 1, digit = 0;
        for (int i = len - 1 ; i >= 0 ; i--) {
        	digit = (digits[i] + carry) % 10;
        	carry = (digits[i] + carry) / 10;
        	if (carry == 1) list.addFirst(0);
        	else {
        		list.addFirst(digit);
        	}
        }
        if (carry == 1) list.addFirst(carry);
        
        return list.stream().mapToInt(i->i).toArray();
    }
	
	public static void main(String[] args) {
		LC0066_PlusOne t = new LC0066_PlusOne();
		System.out.println(Arrays.toString(t.plusOne(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(t.plusOne(new int[] {4, 3, 2, 1})));
		System.out.println(Arrays.toString(t.plusOne(new int[] {0})));
		System.out.println(Arrays.toString(t.plusOne(new int[] {9, 9, 9, 9})));
	}
}
