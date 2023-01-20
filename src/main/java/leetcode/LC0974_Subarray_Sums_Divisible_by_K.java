package leetcode;

public class LC0974_Subarray_Sums_Divisible_by_K {
    public int subarraysDivByK(int[] nums, int k) {
        int[] modCount =  new int[k];

        int remainder = 0;
        for (int num : nums) {
            remainder += (num % k);
            if (remainder < 0) {
                remainder += k;
            }
            remainder %= k;
            modCount[remainder]++;
        }

        int count = 0;
        for (int i = 0; i < k; i++) {
            count += modCount[i] * (modCount[i] - 1) / 2;
        }

        return count + modCount[0];
    }
}
