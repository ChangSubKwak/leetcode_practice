package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0137_SingleNumber_II_X {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
				continue;
			}
			map.put(nums[i], 1);
		}

		int key = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				key = entry.getKey();
				break;
			}
		}
		return key;
	}
}
