package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // row check
        List<Character> l = new ArrayList<>();
        for(int y = 0 ; y < 9 ; y++) {
            l.clear();
            for (int x = 0 ; x < 9 ; x++) {
                if (board[y][x] == '.') continue;
                if (l.contains(board[y][x]))
                    return false;
                l.add(board[y][x]);
            }
        }
        
        for(int x = 0 ; x < 9 ; x++) {
            l.clear();
            for (int y = 0 ; y < 9 ; y++) {
                if (board[y][x] == '.') continue;
                if (l.contains(board[y][x]))
                    return false;
                l.add(board[y][x]);
            }
        }
        
        for (int i = 0 ; i < 9 ; i += 3) {
            for (int j = 0 ; j < 9 ; j += 3) {
                l.clear();
                for(int y = 0 ; y < 3 ; y++) {
                    for(int x = 0 ; x < 3 ; x++) {
                        if (board[i + y][j + x] == '.') continue;
                        if (l.contains(board[i + y][j + x]))
                            return false;
                        l.add(board[i + y][j + x]);
                    }
                }
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		LC0036_ValidSudoku t = new LC0036_ValidSudoku();
		char[][] board = new char[][] {
			 {'5','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(t.isValidSudoku(board));
		
		char[][] board2 = new char[][] {
			 {'8','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(t.isValidSudoku(board2));
	}
}
