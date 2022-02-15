package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0136_Single_Number {
    public int singleNumber(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            s1.add(nums[i]);
            if (s1.contains(nums[i]) && s2.contains(nums[i])) {
                s2.remove(nums[i]);
                continue;
            }
            s2.add(nums[i]);
        }
        System.out.println(s1);
        System.out.println(s2);
        List<Integer> list = new ArrayList<>(s2);
        
        return list.get(0);
    }
	/*
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
    */
}
