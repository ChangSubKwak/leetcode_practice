package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0136_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], 1 + countMap.getOrDefault(nums[i], 0));
        }
        
        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		LC0136_SingleNumber t = new LC0136_SingleNumber();
		System.out.println(t.singleNumber(new int[] {2, 2, 1}));			// 1
		System.out.println(t.singleNumber(new int[] {4, 1, 2, 1, 2}));		// 4
		System.out.println(t.singleNumber(new int[] {1}));					// 1
	}
}
