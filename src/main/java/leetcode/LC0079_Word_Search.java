package leetcode;

public class LC0079_Word_Search {

    public boolean recur(int y, int x, char[][] board, String word, int wordPos, boolean[][] visited) {
        if (y <= -1 || y >= visited.length || x <= -1 || x >= visited[0].length) {
            return false;
        }

        if (visited[y][x] || wordPos >= word.length() || board[y][x] != word.charAt(wordPos)) {
            return false;
        }

        if (wordPos == word.length() - 1) {
            return true;
        }

        boolean isExist = false;
        visited[y][x] = true;
        isExist = isExist || recur(y - 1, x, board, word, wordPos + 1, visited);
        isExist = isExist || recur(y + 1, x, board, word, wordPos + 1, visited);
        isExist = isExist || recur(y, x - 1, board, word, wordPos + 1, visited);
        isExist = isExist || recur(y, x + 1, board, word, wordPos + 1, visited);
        visited[y][x] = false;

        return isExist;
    }
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                boolean[][] visited = new boolean[row][col];
                boolean isExist = recur(y, x, board, word, 0, visited);
                if (isExist) {
                    return true;
                }
            }
        }

        return false;
    }
}
