package leetcode;

public class LC1706_Where_Will_the_Ball_Fall {
    public int[] findBall(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] result = new int[col];

        int x = 0;
        for (int i = 0; i < col; i++) {
            x = i;
            boolean canBeDroped = true;
            for (int j = 0; j < row; j++) {
                if (x + 1 < col && grid[j][x] == 1 && grid[j][x + 1] == 1) { // can move right and down
                    x++;
                    continue;
                }

                if (x - 1 >= 0 && grid[j][x] == -1 && grid[j][x - 1] == -1) { // can move left and down
                    x--;
                    continue;
                }
                canBeDroped = false;
                break;
            }

            result[i] = canBeDroped ? x : -1;
        }

        return result;
    }
}
