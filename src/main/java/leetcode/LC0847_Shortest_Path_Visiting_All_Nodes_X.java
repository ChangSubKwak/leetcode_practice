package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC0847_Shortest_Path_Visiting_All_Nodes_X {
    public int shortestPathLength(int[][] graph) {
        if(graph.length == 1) {
            return 0;
        }
        
        int f = (1 << graph.length) - 1;
        Queue<int []> queue = new LinkedList<>();
        
        for(int i = 0; i < graph.length; i++) {
            queue.add(new int[] {i , 1<<i} );
        }
        
        boolean visit[][] = new boolean[graph.length][f + 1];
        
        int ans=0;
        while (queue.size() > 0) {
            int size = queue.size();
            
            ans++;
            for(int i = 0; i < size; i++) {
                int h[] = queue.poll();
                int n = h[0];
                int b = h[1];
                
                for (int ng : graph[n]) {
                    int nn = b | (1 << ng);
                    
                    if (visit[ng][nn] == true) {
                        continue;
                    }
                    
                    visit[ng][nn] = true;
                    if (nn == f) {
                        return ans;
                    }
                    queue.add(new int[]{ng, nn});
                }
            }
        }
        return -1;
    }
}
