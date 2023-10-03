package leetcode;

public class LC1512_Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[100];
        for (int num : nums) {
            count[num - 1]++;
        }

        int pairCount = 0;
        for (int i = 0; i < 100; i++) {
            pairCount += (count[i] - 1) * count[i] / 2;
        }

        return pairCount;
    }
}
