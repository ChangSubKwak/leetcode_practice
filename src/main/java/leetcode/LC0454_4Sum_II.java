package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC0454_4Sum_II {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Set<Integer> set = IntStream.of(nums4).boxed().collect(Collectors.toCollection(HashSet::new));
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int t = nums3[i] + nums4[j];
                if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);
                    continue;
                }
                map.put(t, 1);
            }
        }
        
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int t = -(nums1[i] + nums2[j]);
                if (map.containsKey(t)) {
                    count += map.get(t);
                }
            }
        }
        
        return count;
    }
}
