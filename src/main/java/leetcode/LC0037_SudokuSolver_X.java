package main.java.leetcode;

import java.util.Arrays;

public class LC0037_SudokuSolver_X {
	public boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0 ; i < 9 ; i++) {
            if (board[row][i] == c) return false;
        	if (board[i][col] == c) return false;
        	if (board[3*(row/3) + i/3 ][3*(col/3) + i%3] == c) return false;
        }
        return true;
	}
	
	public boolean isComplete(char[][] board) {
        for(int y = 0 ; y < 9 ; y++) {
            for(int x = 0 ; x < 9 ; x++) {
            	if (board[y][x] == '.') return false;
            }
        }
        return true;
	}
	
	public void print(char[][] board) {
		int num = 0;
        for(int y = 0 ; y < 9 ; y++) {
            for(int x = 0 ; x < 9 ; x++) {
            	if (board[y][x] == '.') num++;
            	System.out.printf("%3c", board[y][x]);
            }
            System.out.println();
        }
        System.out.println("====================================== " + num);
	}
	
	public void solveSudoku(char[][] board) {
		solve(board);
	}
	
    public boolean solve(char[][] board) {
    	//print(board);
    	
    	for(int y = 0 ; y < 9 ; y++) {
    		for (int x = 0 ; x < 9 ; x++) {
    			if (board[y][x] != '.') continue;
    			for(int z = 1 ; z <= 9 ; z++) {
    				char c = (char) ('0' + z);
    				if (isValid(board, y, x, c)) {
    					board[y][x] = c;
    					
    					if (solve(board)) return true;
    					else board[y][x] = '.';
    				}
    			}
    			return false;
    		}
    	}
    	return true;
    }
    
	public static void main(String[] args) {
		LC0037_SudokuSolver_X t = new LC0037_SudokuSolver_X();
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
		System.out.println(t.solve(board));
		//t.solve(board);
		for (int y = 0 ; y < 9 ; y++)
			System.out.println(Arrays.toString(board[y]));
	}
}
