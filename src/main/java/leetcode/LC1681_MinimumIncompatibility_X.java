package leetcode;

import java.util.*;

public class LC1681_MinimumIncompatibility_X {
//	static public int min = Integer.MAX_VALUE;
//	static public int[] arr;
//	static public int k;
//	
//	private static void permutation(int[] nums, int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
//		if (perArr.size() == r) {
//			int sum = 0, tmin = Integer.MAX_VALUE, tmax = Integer.MIN_VALUE;
//
//			for (int i  = 0 ; i < perArr.size() - 1 ; i+=2 ) {
//				tmin = Integer.MAX_VALUE;
//				tmax = Integer.MIN_VALUE;
//				
//				if (nums[perArr.get(i)] == nums[perArr.get(i+1)]) return;
//
//				if (tmin > nums[perArr.get(i)]) tmin = nums[perArr.get(i)];
//				if (tmin > nums[perArr.get(i+1)]) tmin = nums[perArr.get(i+1)];
//				if (tmax < nums[perArr.get(i)]) tmax = nums[perArr.get(i)];
//				if (tmax < nums[perArr.get(i+1)]) tmax = nums[perArr.get(i+1)];
//				
//				sum += tmax - tmin;
//			}
//			
//			if (min	> sum)
//				min = sum;
//			
//			return;
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (perCheck[i] == 0) {
//				perArr.add(i);
//				perCheck[i] = 1;
//				permutation(nums, n, r, perArr, perCheck);
//				perCheck[i] = 0;
//				perArr.removeLast();
//			}
//		}
//	}
//    
//	
//    public int minimumIncompatibility(int[] nums, int k) {
//    	if (nums.length == 1) return 0;
//    	if (nums.length < k*2) return 0;
//    	
//    	Arrays.sort(nums);
//    	int count[] = new int [17];
//    	for (int i = 0 ; i < nums.length ; i++)
//    		count[nums[i]]++;
//    	
//    	for (int i = 0 ; i <= 16 ; i++)
//    		if (count[i] > k) return -1;
//    	
//    	
//    	this.k = k;
//    	min = Integer.MAX_VALUE;
//    	
//    	LinkedList<Integer> list = new LinkedList<>();
//    	for (int i = 0 ; i < nums.length ; i++)
//    		list.add(nums[i]);
//    	
//    	
//    	permutation(nums, nums.length, nums.length, new LinkedList<>(), new int[nums.length]);
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }

	//*
    private int min = Integer.MAX_VALUE;
    private int bucketSize = 0;
    
    public int minimumIncompatibility(int[] nums, int k) {
        int n = nums.length;
        bucketSize = n / k;
        
        List<Set<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            sets.add(new HashSet<>());
        }
        
        backtrack(nums, 0, sets, 0);
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    private void backtrack(int[] nums, int idx, List<Set<Integer>> sets, int acc) {
        if (idx >= nums.length) {
            min = Math.min(min, acc);
            return;
        }
        
        Set<Set<Integer>> visited = new HashSet<>();
        
        for (Set<Integer> set: sets) {
            if (set.contains(nums[idx]) || set.size() == bucketSize || visited.contains(set)) continue;
            int impact = computeImpact(set, nums[idx]);
            acc += impact;
            if (acc < min) {
                set.add(nums[idx]);
                backtrack(nums, idx+1, sets, acc);
                set.remove(nums[idx]);
            }
            acc -= impact;
            visited.add(set);
        }
    }
    
    private int computeImpact(Set<Integer> set, int num) {
        if (set.size() == 0) return 0;
        if (set.size() == 1) return Math.abs(num - set.iterator().next());
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        
        for (int x: set) {
            lo = Math.min(lo, x);
            hi = Math.max(hi, x);
        }
        
        if (num < lo) return lo - num;
        if (num > hi) return num - hi;
        return 0;
    }
    //*/
	
	public static void main(String[] args) {
		LC1681_MinimumIncompatibility_X t = new LC1681_MinimumIncompatibility_X();
		System.out.println(t.minimumIncompatibility(new int[] {1,2,1,4}, 2));
//		System.out.println(t.minimumIncompatibility(new int[] {7,3,16,15,1,13,1,2,14,5,3,10,6,2,7,15}, 8));
//		System.out.println(t.minimumIncompatibility(new int[] {1,2,1,4}, 2));
//		System.out.println(t.minimumIncompatibility(new int[] {6,3,8,1,3,1,2,2}, 4));
//		System.out.println(t.minimumIncompatibility(new int[] {5,3,3,6,3,3}, 3));
//		System.out.println(t.minimumIncompatibility(new int[] {1,2}, 2));			// 0
//		System.out.println(t.minimumIncompatibility(new int[] {3,1,1}, 1));
	}
}
