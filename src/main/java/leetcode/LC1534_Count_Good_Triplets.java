package leetcode;

public class LC1534_Count_Good_Triplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int length = arr.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (
                            Math.abs(arr[i] - arr[j]) <= a &&
                                    Math.abs(arr[j] - arr[k]) <= b &&
                                    Math.abs(arr[i] - arr[k]) <= c
                    ) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
