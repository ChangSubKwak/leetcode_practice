package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0133_CloneGraph {
	class Node {
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
	
    public Node cloneGraph(Node node) {
    	Node cloneNode = new Node();
    	cloneNode.val = node.val;
    	
    	for (int i = 0; i < node.neighbors.size(); i++) {
    		cloneNode.neighbors.add(node.neighbors.get(i));
    	}
    	
		return cloneNode;
    }
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		LC0133_CloneGraph t = new LC0133_CloneGraph();
		

	}
}
