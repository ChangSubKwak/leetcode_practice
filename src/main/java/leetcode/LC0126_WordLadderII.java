package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC0126_WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    	// init
    	Set<String> dict = new HashSet<String>(wordList);
    	List<List<String>> res = new ArrayList<List<String>>();
    	Map<String, ArrayList<String>> nodeNeighbors = new HashMap<String, ArrayList<String>>();
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	
    	dict.add(beginWord);
    	//bfs(beginWord, endWord, dict, nodeNeighbors, distance);
    	
        // bfs
    	// dfs
    	
    	return null;
    }
	
	public static void main(String[] args) {
		LC0126_WordLadderII t = new LC0126_WordLadderII();
		t.findLadders("", "", null);

	}
}
