package leetcode;

public class LC0852_Peak_Index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length - 2;
        int mid = 1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((arr[mid - 1] < arr[mid]) && (arr[mid] > arr[mid + 1])) {
                break;
            } else if (arr[mid]     > arr[mid + 1]) {
                end = mid - 1;
            } else if (arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            }
        }

        return mid;
    }
}
