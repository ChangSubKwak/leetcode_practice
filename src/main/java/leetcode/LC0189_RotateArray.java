package leetcode;

import java.util.Arrays;

public class LC0189_RotateArray {
    public void rotate(int[] nums, int k) {
    	// ��ü�� �Ųٷ�
    	// 1, 2, 3, 4, 5, 6, 7 --> 7, 6, 5, 4, 3, 2, 1

    	// 0 ���� k -1 ��° ���� �Ųٷ�
    	// 5, 6, 7, 4, 3, 2, 1

    	// k��° ���� ������ ���� �Ųٷ�
    	// 5, 6, 7, 1, 2, 3, 4
    	

    }
    
	public static void main(String[] args) {
		LC0189_RotateArray t = new LC0189_RotateArray();
		
		int[] input = new int[] {-1,-100,3, 99};
		t.rotate(input, 2);
		System.out.println(Arrays.toString(input));
	}
}
