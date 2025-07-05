package leetcode;

public class LC1394_Find_Lucky_Integer_in_an_Array {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // System.out.println(Arrays.toString(count));

        int max = -1;
        for (int i = 1; i <= 500; i++) {
            if (i == count[i]) {
                max = Math.max(max, i);
            }
        }

        return max;
    }
}
