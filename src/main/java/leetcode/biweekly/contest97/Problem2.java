package leetcode.biweekly.contest97;

import java.util.*;

public class Problem2 {
    public int maxCount(int[] banned, int n, int maxSum) {
        TreeSet<Integer> bannedSet = new TreeSet<>();
        for (int i = 0; i < banned.length; i++) {
            bannedSet.add(banned[i]);
        }

        TreeSet<Integer> allowedSet = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            if (bannedSet.contains(i)) {
                continue;
            }
            allowedSet.add(i);
        }

        int count = 0;
        int sum = 0;
        for (Integer i : allowedSet) {
            if (sum + i <= maxSum) {
                sum += i;
                count++;
                continue;
            }
            break;
        }

        return count;
    }
}
