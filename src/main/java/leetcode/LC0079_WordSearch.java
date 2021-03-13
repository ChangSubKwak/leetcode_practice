package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0079_WordSearch {
	public boolean exec(Set<String> visit, char[][] board, String word, StringBuilder checkWord, int y, int x) {
		if (word.equals(checkWord.toString()))
			return true;
		
		int[] dy = { 0, 1, 0,-1};
		int[] dx = { 1, 0,-1, 0};
		
		for (int i = 0 ; i < 4 ; i++) {
 			if (y + dy[i] > board.length-1    || y + dy[i] < 0 ) continue;
			if (x + dx[i] > board[0].length-1 || x + dx[i] < 0 ) continue;
			if (visit.contains((y+dy[i]) + "," + (x+dx[i]))) continue;
			
			if (board[y+dy[i]][x+dx[i]] != word.charAt(checkWord.length()))
				continue;
			
			visit.add((y+dy[i]) + "," + (x+dx[i]));
			checkWord.append(board[y+dy[i]][x+dx[i]]);
			if (exec(visit, board, word, checkWord, y+dy[i], x+dx[i]))
				return true;
			checkWord.setLength(checkWord.length() - 1);
			visit.remove((y+dy[i]) + "," + (x+dx[i]));
		}
		return false;
	}
	
    public boolean exist(char[][] board, String word) {
    	int row = board.length;
    	int col = board[0].length;
    	
    	StringBuilder checkWord = new StringBuilder();
    	Set<String> visit = new HashSet<String>();
    	for (int y = 0 ; y < row ; y++) {
    		for (int x = 0 ; x < col ; x++) {
    			visit.clear();
    			if (board[y][x] != word.charAt(0)) continue;
    			
    			visit.add(y + "," + x);
    	    	checkWord.append(board[y][x]);
    	    	if (exec(visit, board, word, checkWord, y, x)) {
    	    		//System.out.println(y + " , " + x);
    	    		return true;
    	    	}
    	    	checkWord.setLength(checkWord.length() - 1);
    	    	visit.remove(y + "," + x);
    		}
    	}
        return false;
    }
	
	public static void main(String[] args) {
		LC0079_WordSearch t = new LC0079_WordSearch();
		System.out.println(t.exist(new char[][]{{'A', 'A'}}, "AAA"));
//		System.out.println(t.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
//		System.out.println(t.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
//		System.out.println(t.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
	}
}
