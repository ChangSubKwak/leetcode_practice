package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LC2215_Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));
        Set<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));

        set1.removeAll(set2);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(set1));

        set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));
        set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));

        set2.removeAll(set1);
        result.add(new ArrayList<>(set2));

        return result;
    }
}
