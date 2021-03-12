package main.java.leetcode;

public class LC0035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (i = 0 ; i < nums.length ; i++)
        	if (nums[i] >= target)
        		break;
    	
    	return i;
    }
    
	public static void main(String[] args) {
		LC0035_SearchInsertPosition t = new LC0035_SearchInsertPosition();
		System.out.println(t.searchInsert(new int[] {1, 3, 5}, 5));
		System.out.println(t.searchInsert(new int[] {1, 3, 5, 6}, 2));
		System.out.println(t.searchInsert(new int[] {1, 3, 5, 6}, 7));
		System.out.println(t.searchInsert(new int[] {1, 3, 5, 6}, 0));
		System.out.println(t.searchInsert(new int[] {1}, 0));
	}
}
