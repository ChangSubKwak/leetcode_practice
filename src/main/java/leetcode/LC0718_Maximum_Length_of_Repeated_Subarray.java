package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0718_Maximum_Length_of_Repeated_Subarray {
    public int findLength(int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            int num2 = nums2[i];

            List<Integer> list1;
            if (map1.containsKey(num1)) {
                list1 = map1.get(num1);
            } else {
                list1 = new ArrayList<>();
            }

            list1.add(i);
            map1.put(num1, list1);

            List<Integer> list2;
            if (map2.containsKey(num2)) {
                list2 = map2.get(num2);
            } else {
                list2 = new ArrayList<>();
            }
            list2.add(i);
            map2.put(num2, list2);
        }

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        return 3;
    }
}
