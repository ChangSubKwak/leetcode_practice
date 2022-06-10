package util;

import java.util.*;

public class BFS {
    private static final int ROOT_NODE_NUMBER = 0;

    private void recursive(Map<Integer, List<Integer>> nodes, List<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();
        
        result.add(ROOT_NODE_NUMBER);
        queue.addAll(nodes.get(ROOT_NODE_NUMBER));
        
        while(queue.size() > 0) {
            int nodeNum = queue.poll();
            result.add(nodeNum);
            if (nodes.containsKey(nodeNum)) {
                queue.addAll(nodes.get(nodeNum));
            }
        }
    }
    
    public List<Integer> execute(Map<Integer, List<Integer>> nodes) {
        List<Integer> result = new ArrayList<>();
        recursive(nodes, result);
        return result;
    }
}
