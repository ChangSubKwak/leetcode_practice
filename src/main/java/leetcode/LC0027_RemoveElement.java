package main.java.leetcode;

public class LC0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
    	int f = 0;
    	int b = nums.length - 1;
    	while(true) {
    		
    		while(f < nums.length && nums[f] != val)
    			f++;
    		
    		while(b >=0 && nums[b] == val)
    			b--;
    		
    		if (f > b)
    			break;
    		
    		int temp = nums[f];
    		nums[f] = nums[b];
    		nums[b] = temp;
    		
    	}
//    	System.out.println(f);
    	for (int i = 0 ; i < nums.length ;i++)
    		System.out.print(nums[i] + " ");
    	System.out.println();
    	
        return f;
    }
	
	public static void main(String[] args) {
		LC0027_RemoveElement t = new LC0027_RemoveElement();
		System.out.println(t.removeElement(new int[] {3, 2, 2, 3}, 3 ));
		System.out.println(t.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2 ));
	}
}
