package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0350_IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];
        
        for (int i = 0; i < nums1.length; i++) {
            count1[nums1[i]]++;
        }
        
        for (int i = 0; i < nums2.length; i++) {
            count2[nums2[i]]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= 1000; i++) {
            if (count1[i] >= 1 && count2[i] >= 1) {
                int min = Math.min(count1[i], count2[i]);
                for (int j = 0; j < min; j++)
                    list.add(i);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public static void main(String[] args) {
		LC0350_IntersectionofTwoArraysII t = new LC0350_IntersectionofTwoArraysII();
		System.out.println(Arrays.toString(t.intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2})));
	}
}
