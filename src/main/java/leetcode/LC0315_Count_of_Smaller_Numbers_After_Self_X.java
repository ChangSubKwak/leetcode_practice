package leetcode;

import java.util.*;

public class LC0315_Count_of_Smaller_Numbers_After_Self_X {
    private int[] count;

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        count = new int[nums.length];

        int[] indexes = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            indexes[i] = i;
        }

        mergesort(nums, indexes, 0, nums.length - 1);
        for (int i = 0; i < count.length; i++){
            res.add(count[i]);
        }

        return res;
    }

    private void mergesort(int[] nums, int[] indexes, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        mergesort(nums, indexes, start, mid);
        mergesort(nums, indexes, mid + 1, end);
        merge(nums, indexes, start, end);
    }

    private void merge(int[] nums, int[] indexes, int start, int end){
        int mid = (start + end) / 2;
        int leftIndex = start;
        int rightIndex = mid + 1;
        int rightCount = 0;
        int[] newIndexes = new int[end - start + 1];

        int sortIndex = 0;
        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[indexes[rightIndex]] < nums[indexes[leftIndex]]) {
                newIndexes[sortIndex] = indexes[rightIndex];
                rightCount++;
                rightIndex++;
            } else {
                newIndexes[sortIndex] = indexes[leftIndex];
                count[indexes[leftIndex]] += rightCount;
                leftIndex++;
            }
            sortIndex++;
        }

        while (leftIndex <= mid) {
            newIndexes[sortIndex] = indexes[leftIndex];
            count[indexes[leftIndex]] += rightCount;
            leftIndex++;
            sortIndex++;
        }

        while (rightIndex <= end) {
            newIndexes[sortIndex++] = indexes[rightIndex++];
        }

        for (int i = start; i <= end; i++) {
            indexes[i] = newIndexes[i - start];
        }
    }
}
