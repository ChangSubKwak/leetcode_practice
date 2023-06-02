package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC2101_Detonate_the_Maximum {
    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> adjacentInfo = new ArrayList<>();

        int length = bombs.length;
        for (int i = 0; i < length; i++) {
            adjacentInfo.add(new ArrayList<>());
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }

                long[] c1 = new long[]{bombs[i][0], bombs[i][1], bombs[i][2]};
                long[] c2 = new long[]{bombs[j][0], bombs[j][1], bombs[j][2]};

                long xDistance = c1[0] - c2[0];
                long yDistance = c1[1] - c2[1];
                long radiusSquare = c1[2] * c1[2];
                long distanceSquare = xDistance * xDistance + yDistance * yDistance;

                // System.out.println("xDistance : " + xDistance + " | yDistance : " + yDistance + " | distanceSquare : " + distanceSquare + " | radiusSquare : " + radiusSquare);
                if (distanceSquare <= radiusSquare) {
                    adjacentInfo.get(i).add(j);
                }
            }
        }

        int max = -1;
        for (int i = 0; i < adjacentInfo.size(); i++) {
            Set<Integer> visited = new HashSet<>();
            recur(i, adjacentInfo, visited);
            if (max < visited.size()) {
                max = visited.size();
            }
        }

        return max;
    }

    private void recur(int start, List<List<Integer>> adjacentInfo, Set<Integer> visited) {
        if (visited.contains(start)) {
            return;
        }

        visited.add(start);
        for (int i = 0; i < adjacentInfo.get(start).size(); i++) {
            int next = adjacentInfo.get(start).get(i);
            recur(next, adjacentInfo, visited);
        }
    }
}
