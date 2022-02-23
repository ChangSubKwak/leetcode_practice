package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0133_Clone_Graph {
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
	
    private Map<Integer, Node> nodeMap;
    
    public void doRecursive(Node node) {
        if (node == null || nodeMap.containsKey(node.val)) {
            return;
        }
            
        nodeMap.put(node.val, new Node(node.val));
        Node main = nodeMap.get(node.val);
        for (int i = 0; i < node.neighbors.size(); i++) {
            doRecursive(node.neighbors.get(i));
            Node current = nodeMap.get(node.neighbors.get(i).val);
            main.neighbors.add(current);
        }
    }
    
    public Node cloneGraph(Node node) {
        nodeMap = new HashMap<>();
        doRecursive(node);
        
        return nodeMap.get(1);
    }
	
	/*
	class Solution {
	    private HashMap<Integer, Node> map = new HashMap<>();
	    public Node cloneGraph(Node node) {
	        return clone(node);
	    }

	    private Node clone(Node node) {
	        if (node == null) return null;
	        
	        if (map.containsKey(node.val)) {
	            return map.get(node.val);
	        }
	        Node clone = new Node(node.val);
	        map.put(clone.val, clone);
	        for (Node neighbor : node.neighbors) {
	            clone.neighbors.add(clone(neighbor));
	        }
	        return clone;
	    }
	}
	*/
}