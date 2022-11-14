package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0948_Most_Stones_Removed_with_Same_Row_or_Column_X {
    public int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet<>();
        int numberOfIslands = 0;
        for (int[] stone : stones) {
            if (!visited.contains(stone)) {
                dfs(stone, visited, stones);
                numberOfIslands++;
            }
        }

        return stones.length - numberOfIslands;
    }

    private void dfs(int[] stone, Set<int[]> visited, int[][] stones) {
        visited.add(stone);
        for (int[] anotherStone : stones) {
            if (!visited.contains(anotherStone)) {
                if (stone[0] == anotherStone[0] || stone[1] == anotherStone[1]) {
                    dfs(anotherStone, visited, stones);
                }
            }
        }
    }
}
