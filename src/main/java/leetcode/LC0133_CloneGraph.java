package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	Map<Integer, Node> map = new HashMap<>();
	
	
    public Node cloneGraph(Node node) {
    	if (node == null) {
    		return null;
    	}
    	
    	Node cloneNode = new Node();
    	cloneNode.val = node.val;
    	
    	List<Node> neighborsNode = node.neighbors;
    	for(int i = 0; i < neighborsNode.size(); i++) {
    		cloneNode.neighbors.add(neighborsNode.get(i));
    	}
    	
    	return cloneNode;
    }
    
    public void executeTest() {
    	Node node1 = new Node(1);
    	Node node2 = new Node(2);
    	Node node3 = new Node(3);
    	Node node4 = new Node(4);
    	
    	node1.neighbors.add(node2);
    	node1.neighbors.add(node4);
    	
    	node2.neighbors.add(node1);
    	node2.neighbors.add(node3);
    	
    	node3.neighbors.add(node2);
    	node3.neighbors.add(node4);
    	
    	node4.neighbors.add(node1);
    	node4.neighbors.add(node3);
    	
    	printNodeAndNeighborsVal(node1);
    	printNodeAndNeighborsVal(node2);
    	printNodeAndNeighborsVal(node3);
    	printNodeAndNeighborsVal(node4);

    	System.out.println("--- Clone Node ---");
    	Node cloneNode = cloneGraph(node1);
    	printNodeAndNeighborsVal(cloneNode);
    }
    
    public void printNodeAndNeighborsVal(Node node) {
    	System.out.print("val(" + node.val + ")\t");
    	System.out.print("neighbors(");
    	for (int i = 0; i < node.neighbors.size(); i++) {
    		System.out.print(node.neighbors.get(i).val + (i == node.neighbors.size() - 1 ? "" : " ") );
    	}
    	System.out.println(")");
    }
    
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		LC0133_CloneGraph t = new LC0133_CloneGraph();
		t.executeTest();
	}
}
