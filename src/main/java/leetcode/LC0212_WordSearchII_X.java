package leetcode;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

public class LC0212_WordSearchII_X {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs (board, i, j, root, res);
            }
        }
        return res;
    }

    private void dfs(char[][] board, int i, int j, TrieNode currentNode, List<String> res) {
        char orginalCharacter = board[i][j];
        if (orginalCharacter == '#' || currentNode.next[orginalCharacter - 'a'] == null) return;
        currentNode = currentNode.next[orginalCharacter - 'a'];
        if (currentNode.word != null) {  // found one
            res.add(currentNode.word);
            currentNode.word = null;     // prevent to search the current word
        }

        board[i][j] = '#';	   // to prevent to search adjacent cells repeatedly
        if (i > 0)                   dfs(board, i - 1, j    , currentNode, res); 
        if (j > 0)                   dfs(board, i    , j - 1, currentNode, res);
        if (i < board.length - 1)    dfs(board, i + 1, j    , currentNode, res); 
        if (j < board[0].length - 1) dfs(board, i    , j + 1, currentNode, res); 
        board[i][j] = orginalCharacter;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode p = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (p.next[i] == null) p.next[i] = new TrieNode();
                p = p.next[i];
            }
            p.word = w;
        }
        return root;
    }

    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }

	public static void main(String[] args) {
		LC0212_WordSearchII_X t = new LC0212_WordSearchII_X();
		
		char[][] board = {
				{ 'o', 'a', 'a', 'n' },
				{ 'e', 't', 'a', 'e' },
				{ 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' }
		};
		System.out.println(t.findWords(board, Arrays.array("oath","pea","eat","rain")));
	}
}
