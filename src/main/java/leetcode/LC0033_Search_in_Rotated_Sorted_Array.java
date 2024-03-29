package leetcode;

public class LC0033_Search_in_Rotated_Sorted_Array {
    public int binsearch(int[] array, int start, int end, int el) {
        if ( end < start ) return -1;

        int half = start + (end-start)/2;

        if ( array[half] == el )
            return half;
        if ( start == end )
            return -1;

        if ( array[half] > el )
            return binsearch(array, 0, half-1, el);
        else
            return binsearch(array, half+1, end, el);
    }


    public int search(int[] nums, int target) {
        int len = nums.length;
        int[] t;
        t = new int[nums.length];

        int start = 0;
        for (int i = 0 ; i < nums.length - 1 ; i++)
            if (nums[i] > nums[i+1]) {
                start = i+1;
                break;
            }

        System.arraycopy(nums, start, t, 0, len - start);
        System.arraycopy(nums, 0, t, len - start, start );
        int pos = binsearch(t, 0, len, target);
        if (pos == -1) return pos;
        pos = (pos + start) % len;

        return pos;
    }

}
