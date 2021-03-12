package main.java.leetcode;

import java.util.Arrays;

public class LC1665_MinimumInitialEnergytoFinishTasks_X {
    public int minimumEffort(int[][] A) {
        int res = 0;
        Arrays.sort(A, (a1, a2) -> (a1[1] - a1[0]) - (a2[1] - a2[0]));
        for (int[] a : A) {
            res = Math.max(res + a[0], a[1]);
        }
        return res;
    }
	

	public static void main(String[] args) {
		LC1665_MinimumInitialEnergytoFinishTasks_X t = new LC1665_MinimumInitialEnergytoFinishTasks_X();
		System.out.println(t.minimumEffort(new int[][] {{1,2},{2,4},{4,8}}));
	}

}
