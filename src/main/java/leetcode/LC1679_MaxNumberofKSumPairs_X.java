package main.java.leetcode;

import java.util.HashMap;
import java.util.Map; 

public class LC1679_MaxNumberofKSumPairs_X {
//	public int maxOperations(int[] nums, int k) {
//		int s = 0, e = 0, count = 0;
//		
//		while(s < len - 1) {
//			if (nums[s] == -1) {
//				s++;
//				continue;
//			}
//			
//			int sVal = nums[s];
//			e = s + 1;
//			
//			boolean isMatch = false;
//			while(e < len ) {
//				int eVal = nums[e];
//				if (nums[e] == -1) {
//					e++;
//					continue;
//				}
//				
//				
//				if (sVal + eVal == k) {
//					nums[s] = -1;
//					nums[e] = -1;
//					count++;
//					isMatch=true;
//					//s++;
//					break;
//				}
//				e++;
//			}
//			
//			if (!isMatch) nums[s] = -1;
//			s++;
//		}
//		
//		return count;
//	}
	
	
//	public int maxOperations(int[] nums, int k) {
//		int len = nums.length;
//		if (len < 2) return 0;
//		
////		Arrays.sort(nums);
//		
//		Map<Integer, LinkedList<Integer>> map = new HashMap<>();
//		for (int i = 0 ; i < len ; i++) {
//			for (int j = 0 ; j < len ; j++) {
//				if (nums[i] + nums[j] == k) {
//					if (map.containsKey(nums[i])) {
//						LinkedList<Integer> ll = map.get(nums[i]);
//						if (!ll.contains(j)) ll.add(j);
//						map.put(nums[i], ll);
//					} else {
//						LinkedList<Integer> ll = new LinkedList<>();
//						ll.add(j);
//						map.put(nums[i], ll);
//					}
//				}
//			}
//		}
//
//		int count = 0;
//		System.out.println(map);
//		
//		return count;
//	}
	
	public int maxOperations(int[] nums, int k) {
		int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        for (int i = 0 ; i < len ; i++) {
        	int remainKey = k - nums[i];
        	if (remainKey <= 0) continue;
        	
            if (map.containsKey(nums[i]) && map.get(nums[i]) > 0) {
                map.put(nums[i], map.get(nums[i]) - 1);
                count++;
            } else {
                map.put(remainKey, map.getOrDefault(remainKey, 0) + 1);
            }
        }
		return count;
	}

	public static void main(String[] args) {
		LC1679_MaxNumberofKSumPairs_X t = new LC1679_MaxNumberofKSumPairs_X();
		System.out.println(t.maxOperations(new int[] {1, 2, 3, 4}, 5));				// 2
		System.out.println(t.maxOperations(new int[] {3, 1, 3, 4, 3}, 6));			// 1
		System.out.println(t.maxOperations(new int[] {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));		// 
		System.out.println(t.maxOperations(new int[] {2,2,2,3,1,1,4,1}, 4));		// 2
	}
}
