package leetcode;

import java.util.*;

public class LC0547_Number_of_Provinces {
    private void recur(int start, int[][] isConnected, Set<Integer> visited) {
        if (visited.contains(start)) {
            return;
        }

        visited.add(start);
        for (int i = 0; i < isConnected.length; i++) {
            if (i == start || isConnected[start][i] == 0) {
                continue;
            }

            recur(i, isConnected, visited);
        }
    }

    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();

        int length = isConnected.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (visited.size() == length) {
                break;
            }

            if (visited.contains(i)) {
                continue;
            }
            recur(i, isConnected, visited);
            count++;
        }

        return count;
    }
}
