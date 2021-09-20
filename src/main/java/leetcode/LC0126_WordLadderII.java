package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LC0126_WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    	// init
    	Set<String> dict = new HashSet<String>(wordList);
    	List<List<String>> res = new ArrayList<List<String>>();
    	Map<String, ArrayList<String>> nodeNeighbors = new HashMap<String, ArrayList<String>>();
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	
    	dict.add(beginWord);
    	bfs(beginWord, endWord, dict, nodeNeighbors, distance);
    	
        // bfs
    	// dfs
    	
    	return null;
    }
    
    private void bfs(String beginWord, String endWord, Set<String> dict, Map<String, ArrayList<String>> nodeNeighbors, Map<String, Integer> distance) {
    	for (String str: dict) {
    		nodeNeighbors.put(str, new ArrayList<String>());
    	}
    	
    	Queue<String> queue = new LinkedList<String>();
    	queue.offer(beginWord);
    	distance.put(beginWord, 0);
    	
    	while (!queue.isEmpty()) {
    		int count = queue.size();
    		boolean foundEnd = false;
    		
    		for (int i = 0; i < count; i++) {
    			String cur = queue.poll();
    			int curDistance = distance.get(cur);
    			List<String> neighbors = getNeighbors(cur, dict);
    		}
    	}
    	
    }
    
    private List<String> getNeighbors(String node, Set<String> dict) {
    	List<String> res = new ArrayList<>();
    	char[] chs = node.toCharArray();
    	
    	for (char ch = 'a'; ch <= 'z'; ch++) {
    		for (int i = 0; i < chs.length; i++) {
    			if (chs[i] == ch) {
    				continue;
    			}
    			char old_ch = chs[i];
    			chs[i] = ch;
    			if (dict.contains(String.valueOf(chs))) {
    				res.add(String.valueOf(chs));
    			}
    			chs[i] = old_ch;
    		}
    	}
    	
    	return res;
    }
	
	public static void main(String[] args) {
		LC0126_WordLadderII t = new LC0126_WordLadderII();
		t.findLadders("", "", null);

	}
}
