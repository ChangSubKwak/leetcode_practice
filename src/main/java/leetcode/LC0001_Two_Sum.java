package leetcode;

import java.util.*;

public class LC0001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] remain = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            remain[i] = target - nums[i];
        }

        int first = -1;
        int second = -1;
        for (int i = 0; i < remain.length; i++) {
            if (map.containsKey(remain[i])) {
                first = i;
                second = map.get(remain[i]);

                if (first == second) {
                    continue;
                }
                break;
            }
        }
        int[] result = new int[] {first, second};
        Arrays.sort(result);

        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        
        int first = -1, second = -1;
        for (int i = 0; i < nums.length; i++) {
            first = i;
            if (Objects.nonNull(map.get(nums[i]))) {
                second = map.get(nums[i]);
                if (first == second) {
                    continue;
                }
                break;
            } 
        }
        return first < second ? new int[] { first, second } : new int[] { second, first };
    }
	
    public int[] twoSum1(int[] nums, int target) {
        int[] ret = new int[2];
        
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }
            }
        }
        
        return ret;
    }
}
