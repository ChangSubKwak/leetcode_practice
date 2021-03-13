package leetcode;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.*;

public class LC0015_3Sum_X {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	
    	if (nums.length < 3)
    		return list;
    	
    	for (int i = 0 ; i < nums.length ; i++) {
    		if (i == 0 || nums[i] > nums[i-1] ) {
    			int j = i + 1;
    			int k = nums.length - 1;
    			
    			while (j < k) {
    				if (nums[i] + nums[j] + nums[k] == 0) {
    					List<Integer> tl = new ArrayList<Integer>();
    					tl.add(nums[i]);	tl.add(nums[j]);	tl.add(nums[k]);
    					list.add(tl);
    					
    					j++;
    					k--;
    					
    					while(j<k && nums[j] == nums[j-1])
    						j++;
    					while(j<k && nums[k] == nums[k+1])
    						k--;
    				}
    				else if (nums[i] + nums[j] + nums[k] < 0) j++;
    				else                                      k--;
    			}
    			
    		}
    	}
    	
        return list;
    }
	
	public static void main(String[] args) {
		LC0015_3Sum_X lc = new LC0015_3Sum_X();
		
		//List<List<Integer>> list = new ArrayList<List<Integer>>();
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		List<Integer> l1 = Arrays.stream(new int[]{-1, 0, 1}).boxed().collect(Collectors.toList());
//		List<Integer> l2 = Arrays.stream(new int[]{-1,-1, 2}).boxed().collect(Collectors.toList());
		
		System.out.println(lc.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

		
		
	}
}
