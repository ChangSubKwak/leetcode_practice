package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
    	ArrayList<String> solution = new ArrayList<>();
    	
    	dict.add(beginWord);
    	bfs(beginWord, endWord, dict, nodeNeighbors, distance);
    	dfs(beginWord, endWord, dict, nodeNeighbors, distance, solution, res);
    	
    	return res;
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
    			
    			for (String neighbor: neighbors) {
    				nodeNeighbors.get(cur).add(neighbor);
    				if (!distance.containsKey(neighbor)) {
    					distance.put(neighbor, curDistance + 1);
    					if (endWord.equals(neighbor)) {
    						foundEnd = true;
    					} else {
    						queue.offer(neighbor);
    					}
    				}
    			}
    		}
    		
    		if (foundEnd) {
    			break;
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
    			char old_ch = chs[i];			// why does it assign to old_ch?
    											// use old_ch to recover original char 
    			chs[i] = ch;
    			if (dict.contains(String.valueOf(chs))) {
    				res.add(String.valueOf(chs));
    			}
    			chs[i] = old_ch;
    		}
    	}
    	
    	return res;
    }
    
    private void dfs(String startWord, String endWord, Set<String> dict, Map<String, ArrayList<String>> nodeNeighbors, Map<String, Integer> distance, ArrayList<String> solution, List<List<String>> res) {
    	solution.add(startWord);
    	if (endWord.equals(startWord)) {
    		res.add(new ArrayList<String>(solution));
    	} else {
    		for (String next : nodeNeighbors.get(startWord)) {
    			if (distance.get(next) == distance.get(startWord) + 1) {
    				dfs(next, endWord, dict, nodeNeighbors, distance, solution, res);
    			}
    		}
    	}
    }
	
	public static void main(String[] args) {
		LC0126_WordLadderII t = new LC0126_WordLadderII();
		System.out.println(t.findLadders("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
	}
}
