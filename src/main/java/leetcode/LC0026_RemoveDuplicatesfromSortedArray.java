package main.java.leetcode;

public class LC0026_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
    	if (nums.length < 2)
    		return nums.length;
    	
    	int count = 1;
        for (int i = 1 ; i < nums.length ; i++) {
        	if (nums[i-1] != nums[i]) {
        		nums[count] = nums[i];
        		count++;
        	}
        }
    	return count;
    }
	
	public static void main(String[] args) {
		LC0026_RemoveDuplicatesfromSortedArray t = new LC0026_RemoveDuplicatesfromSortedArray();
		
//		System.out.println(t.removeDuplicates(new int[] {}));
//		System.out.println(t.removeDuplicates(new int[] {1}));	
//		System.out.println(t.removeDuplicates(new int[] {1, 1, 2}));		
//		System.out.println(t.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
		
		int[] res = new int[] {0,0,1,1,1,2,2,3,3,4};
		int len = 0;
		len = t.removeDuplicates(res);
		System.out.print("[");
		for (int i = 0 ; i < len ; i++) 
			System.out.print(res[i] + (i == len -1 ? "" : ",") );
		System.out.println("]");
	}
}
