package leetcode;

import java.util.Arrays;

public class LC0187_RepeatedDNASequences {
	private void swap(int[] nums, int start, int end) {
		int length = (end - start + 1) / 2;
		int index = start;
    	
		while(index < start + length) {
    		int temp = nums[index];
    		nums[index] = nums[end - 1 - index + start];
    		nums[end - 1 - index + start] = temp;
    		System.out.println(index);
    		index++;
    	}
	}
	
    public void rotate(int[] nums, int k) {
    	// 1, 2, 3, 4, 5, 6, 7 --> 7, 6, 5, 4, 3, 2, 1
    	int length = nums.length;
    	swap(nums, 0, length);
    	System.out.println(Arrays.toString(nums));

    	// 0 ���� k -1 ��° ���� �Ųٷ�
    	// 5, 6, 7, 4, 3, 2, 1
    	swap(nums, 0, k);
    	System.out.println(Arrays.toString(nums));

    	// k��° ���� ������ ���� �Ųٷ�
    	// 5, 6, 7, 1, 2, 3, 4
    	swap(nums, k, length);
    	System.out.println(Arrays.toString(nums));
    }
    
	public static void main(String[] args) {
		LC0187_RepeatedDNASequences t = new LC0187_RepeatedDNASequences();

//		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
//		t.rotate(input, 3);
//		int[] input = new int[] {-1,-100,3, 99};
//		t.rotate(input, 2);
		int[] input = new int[] { 1, 2, 3 };
		t.rotate(input, 1);
		System.out.println(Arrays.toString(input));
	}
}
