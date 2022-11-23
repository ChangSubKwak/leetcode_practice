package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0038_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        int rowLength = board.length;
        int colLength = board[0].length;
        int SIZE = 9;

        for (int i = 0; i < SIZE; i++) {
            Set<Integer> rowData = new HashSet<>();
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rowData.contains(board[i][j] - '0')) {
                    return false;
                }
                rowData.add(board[i][j] - '0');
            }

            Set<Integer> colData = new HashSet<>();
            for (int j = 0; j < SIZE; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (colData.contains(board[j][i] - '0')) {
                    return false;
                }
                colData.add(board[j][i] - '0');
            }
        }

        for (int i = 0; i < SIZE; i += 3) {
            for (int j = 0; j < SIZE; j += 3) {
                // box check
                Set<Integer> boxData = new HashSet<>();
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        if (board[row][col] == '.') {
                            continue;
                        }
                        if (boxData.contains(board[row][col] - '0')) {
                            return false;
                        }
                        boxData.add(board[row][col] - '0');
                    }
                }
            }
        }
        return true;
    }
}
