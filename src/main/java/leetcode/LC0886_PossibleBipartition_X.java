package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0886_PossibleBipartition_X {
	List<Integer> graph[];
	Map<Integer, Integer> color;
	
	public boolean dfs(int node, int c) {
		if (color.containsKey(node))
			return color.get(node) == c;
		color.put(node, c);
		
		for (int i : graph[node])
			if (!dfs(i, c ^ 1))
				return false;
		return true;
	}
	
    public boolean possibleBipartition(int N, int[][] dislikes) {
    	graph = new ArrayList[N+1];
    	for (int i = 1 ; i <= N ; i++)
    		graph[i] = new ArrayList<>();
    	
    	for (int i = 0 ; i < dislikes.length ; i++) {
   			graph[dislikes[i][0]].add(dislikes[i][1]);
   			graph[dislikes[i][1]].add(dislikes[i][0]);
    	}

    	color = new HashMap<>();
    	for (int i = 1 ; i <= N ; i++)
    		if (!color.containsKey(i) && !dfs(i, 0))
    			return false;
        return true;
    }
	
	public static void main(String[] args) {
		LC0886_PossibleBipartition_X t = new LC0886_PossibleBipartition_X();
		
//		Set<Integer> s1 = new HashSet<>();
//		s1.add(1);		s1.add(2);		s1.add(3);
//		
//		Set<Integer> s2 = new HashSet<>();
//		s2.add(2);		s2.add(3);		s1.add(4);
//		
//		s1.addAll(s2);
//		System.out.println(s1);
//		
//		s1.retainAll(s2);
//		System.out.println(s1);
//		
//		s1.removeAll(s2);
//		System.out.println(s1);
//		System.exit(0);
		
		System.out.println(t.possibleBipartition(4, new int[][]{ {1,2}, {1,3}, {2,4}} ));
		System.out.println(t.possibleBipartition(3, new int[][]{ {1,2}, {1,3}, {2,3}} ));
		System.out.println(t.possibleBipartition(5, new int[][]{ {1,2}, {2,3}, {3,4}, {4,5}, {1,5}} ));
	}
}
