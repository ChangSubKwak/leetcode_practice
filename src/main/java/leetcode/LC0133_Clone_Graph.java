package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0133_Clone_Graph {
	static class Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
    private Map<Integer, Node> visited;

    private void depthFirstSearch(Node node) {
        if (node == null || visited.containsKey(node.val)) {
            return;
        }

        visited.put(node.val, new Node(node.val));
        Node parent = visited.get(node.val);
        int size = node.neighbors.size();
        for (int i = 0; i < size; i++) {
            Node neighbor = node.neighbors.get(i);
            depthFirstSearch(neighbor);

            int value = neighbor.val;
            Node child = visited.get(value);

            parent.neighbors.add(child);
        }
    }

    public Node cloneGraph(Node node) {
        visited = new HashMap<>();
        depthFirstSearch(node);
        return visited.get(1);
    }
}