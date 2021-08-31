package leetcode;

import java.util.Arrays;

public class LC0130_SurroundedRegions_X {
    private int row;
    private int col;
    
    public void recursive(char[][] board, int y, int x) {
        if (y < 0 || y > row - 1 || x < 0 || x > col - 1) {
            return;
        }
        
        if (board[y][x] == 'O') {
            board[y][x] = 'M';
            recursive(board, y-1, x);
            recursive(board, y, x+1);
            recursive(board, y+1, x);
            recursive(board, y, x-1);
        }
    }
    
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        
        for (int x = 0; x < col; x++) {
            recursive(board, 0, x);
            if (row > 0 ) {
                recursive(board, row - 1, x);
            }
        }
        
        for (int y = 0; y < row; y++) {
            recursive(board, y, 0);
            if (col > 0 ) {
                recursive(board, y, col - 1);
            }
        }
        
        
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (board[y][x] == 'O') {
                    board[y][x] = 'X';
                }
                if (board[y][x] == 'M') {
                    board[y][x] = 'O';
                }
            }
        }
    }
	
	public static void main(String[] args) {
		LC0130_SurroundedRegions_X t = new LC0130_SurroundedRegions_X();
		char[][] board = {
			{'O','X','X','O','X'},
			{'X','O','O','X','O'},
			{'X','O','X','O','X'},
			{'O','X','O','O','O'},
			{'X','X','O','X','O'}
		};
		
		t.solve(board);
		for (int y = 0; y < board.length; y++) {
			System.out.println(Arrays.toString(board[y]));
		}
	}
}
