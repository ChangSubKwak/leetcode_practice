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

    private List<Integer> visitList;
    private Map<Integer, Node> map;
    
    public void dfs(Node node) {
        if (visitList.contains(node.val)) {
            return;
        }
        
        Node cloneNode = new Node();
    	cloneNode.val = node.val;
    	for (int i = 0; i < node.neighbors.size(); i++) {
    		cloneNode.neighbors.add(node.neighbors.get(i) );
    	}
        //map.put(cloneNode.val, )
    }
    
    public Node cloneGraph(Node node) {
    	visitList = new ArrayList<>();
        map = new HashMap<>();
        dfs(node);
    	
		return null;
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
