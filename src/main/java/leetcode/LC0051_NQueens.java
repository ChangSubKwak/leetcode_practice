package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC0051_NQueens {
	public List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = '.';
		List<List<String>> res = new ArrayList<>();
		dfs(board, 0, res);
		return res;
	}

	private void dfs(char[][] board, int colIndex, List<List<String>> res) {
		if(colIndex == board.length) {
			res.add(construct(board));
			return;
		}

		for(int i = 0; i < board.length; i++) {
			if(validate(board, i, colIndex)) {
				board[i][colIndex] = 'Q';
				dfs(board, colIndex + 1, res);
				board[i][colIndex] = '.';
			}
		}
	}

	private boolean validate(char[][] board, int newY, int newX) {
		for(int y = 0; y < board.length; y++) {
			for(int x = 0; x < newX; x++) {
				if (board[y][x] == 'Q' && (Math.abs(newY - y) == Math.abs(newX - x) || newY == y)) {
					return false;
				}
			}
		}

		return true;
	}

	private List<String> construct(char[][] board) {
		List<String> res = new LinkedList<>();
		for (char[] chars : board) {
			String s = new String(chars);
			res.add(s);
		}
		return res;
	}

	/**
	 * solution #1
	 */
	/*
	public boolean check(List<Integer> rowList, int x, int len) {
		int[] dx = {-1,  1,  1, -1};
		int[] dy = {-1, -1,  1,  1};
		
		int y = rowList.size();
		for(int ty = 0 ; ty < rowList.size() ; ty++) {
			int tx = rowList.get(ty);
			if (tx == x) {
				return false;
			}
			
			for (int i = 0; i < 4; i++) {
				for (int j = 1 ; j < len ; j++) {
					if (tx + dx[i] * j < 0 || tx + dx[i] * j >= len) {
						continue;
					}
					
					if (ty + dy[i] * j < 0 || ty + dy[i] * j >= len) {
						continue;
					}
					
					if (tx + dx[i] * j == x && ty + dy[i] * j == y) {
						return false;					
					}
				}
			}
		}
		return true;
	}

	public void execute(List<List<String>> result, char[][] board, List<Integer> rowList) {
		int len = board.length;
		if (rowList.size() == len) {
			List<String> t = new ArrayList<>();
			for (int i = 0 ; i < len ; i++) {
				t.add(String.valueOf(board[i]));
			}
			result.add(t);
			return;
		}
		
		for (int x = 0 ; x < len ; x++) {
			if (rowList.contains(x)) {
				continue;
			}
			
			if (!check(rowList, x, len)) {
				continue;
			}
			
			board[rowList.size()][x] = 'Q';
			rowList.add(x);
			execute(result, board, rowList);
			rowList.remove(rowList.size() - 1);
			board[rowList.size()][x] = '.';
		}
	}

    public List<List<String>> solveNQueens(int n) {
    	List<List<String>> result = new ArrayList<>();
    	if (n==1) {
    		result.add(Arrays.asList("Q"));
    		return result;
    	}
    	
    	char[][] board = new char[n][n];
    	for (int i = 0 ; i < n ; i++)
    		for (int j = 0 ; j < n ; j++)
    			board[i][j] = '.';
    	
    	execute(result, board, new ArrayList<Integer>());
    	
        return result;
    }

	*/
}
