package leetcode;

import java.util.*;

public class LC0212_Word_Search_II_TLE {
    private List<String> result;
    private boolean[][] visited;
    private int rowSize;
    private int colSize;

    private void recur(int y, int x, char[][] board, String word, int pos) {
        if (y < 0 || rowSize <= y || x < 0 || colSize <= x || visited[y][x]) {
            return;
        }

        if (result.contains(word)) {
            return;
        }

        if (word.charAt(pos) != board[y][x]) {
            return;
        }

        if (pos + 1 == word.length()) {
            result.add(word);
            return;
        }

        visited[y][x] = true;
        recur(y + 1, x, board, word, pos + 1);
        recur(y - 1, x, board, word, pos + 1);
        recur(y, x + 1, board, word, pos + 1);
        recur(y, x - 1, board, word, pos + 1);
        visited[y][x] = false;

    }

    public List<String> findWords(char[][] board, String[] words) {
        result = new ArrayList<>();
        rowSize = board.length;
        colSize = board[0].length;
        visited = new boolean[rowSize][colSize];

        for (String word : words) {
            for (int y = 0; y < rowSize; y++) {
                for (int x = 0; x < colSize; x++) {
                    recur(y, x, board, word, 0);
                }
            }
        }

        return result;
    }
}
