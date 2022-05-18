package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1192_Critical_Connections_in_a_Network_X {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
        	graph[i] = new ArrayList<>();
        }
        
        for(List<Integer> oneConnection : connections) {
            graph[oneConnection.get(0)].add(oneConnection.get(1));
            graph[oneConnection.get(1)].add(oneConnection.get(0));
        }
        
        int timer[] = new int[1];
        List<List<Integer>> results = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int []timeStampAtThatNode = new int[n]; 
        criticalConnectionsUtil(graph, -1, 0, timer, visited, results, timeStampAtThatNode);
        
        return results;
    }
    
    public void criticalConnectionsUtil(List<Integer>[] graph, int parent, int node, int timer[], boolean[] visited, List<List<Integer>> results, int []timeStampAtThatNode) {
        visited[node] = true;
        timeStampAtThatNode[node] = timer[0]++;
        int currentTimeStamp = timeStampAtThatNode[node];
        
        for (int oneNeighbour : graph[node]) {
            if(oneNeighbour == parent) {
            	continue;
            }
            
            if(!visited[oneNeighbour]) {
            	criticalConnectionsUtil(graph, node, oneNeighbour, timer, visited, results, timeStampAtThatNode);
            }
            
            timeStampAtThatNode[node] = Math.min(timeStampAtThatNode[node], timeStampAtThatNode[oneNeighbour]);
            
            if (currentTimeStamp < timeStampAtThatNode[oneNeighbour]) {
            	results.add(Arrays.asList(node, oneNeighbour));
            }
        }
    }
}
