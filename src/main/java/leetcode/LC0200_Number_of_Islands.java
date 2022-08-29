package leetcode;

public class LC0200_Number_of_Islands {
    private int[][] visit;
    private int count;
    private int row;
    private int col;

    private void recur(int y, int x, char[][] grid) {
        if (visit[y][x] > 0 || grid[y][x] == '0') {
            return;
        }

        visit[y][x] = count;

        if (x - 1 >= 0) {
            recur(y, x - 1, grid);
        }

        if (x + 1 < col) {
            recur(y, x + 1, grid);
        }

        if (y - 1 >= 0) {
            recur(y - 1, x, grid);
        }

        if (y + 1 < row) {
            recur(y + 1, x, grid);
        }

    }

    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;

        visit = new int[row][col];
        count = 0;

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (visit[y][x] > 0 || grid[y][x] == '0') {
                    continue;
                }
                count++;
                recur(y, x, grid);
            }
        }
        return count;
    }
}
