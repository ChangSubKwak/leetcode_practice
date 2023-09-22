package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC0004_Median_of_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        
        System.out.println("list : " + list);
        Collections.sort(list);
        
        int size = list.size();
        double median = 0;
        if (size % 2 == 0) {
            int first  = list.get(size / 2 - 1);
            int second = list.get(size / 2);
            median = (first + second) / 2.0;
        } else {
            median = list.get(size / 2);
        }
        
        return median;
    }
}
