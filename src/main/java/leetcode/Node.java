package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    
    int maxDepth;
    List<Integer> list;
    ArrayList<Integer>[] levelList;
	public List<Node> children;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
    
	public void preorder(Node root) {
		if (root == null) return;
		list.add( root.val );
		preorder(root.left);
		preorder(root.right);
	}
	
	public List<Integer> executeAndGetPreOrderResult() {
		list = new ArrayList<>();
		preorder(this);
		return list;
	}
    
	public void traverseLevel(Node root, int depth) {
		if (root == null) {
			levelList[depth].add( null );
			return;
		}
		levelList[depth].add( root.val );
		traverseLevel(root.left, depth + 1);
		traverseLevel(root.right, depth + 1);
	}
	
	public String constructLevelList() {
		maxDepth  = executeAndGetPreOrderResult().size() + 1;
		levelList = new ArrayList[maxDepth];
		for (int i = 0 ; i < maxDepth ; i++)
			levelList[i] = new ArrayList<Integer>();
		
		traverseLevel(this, 0);
		
		List<Integer> res = new ArrayList<>();
		for (int i = 0 ; i < maxDepth ; i++) {
			if (levelList[i].size() == 0) continue;
			for (int j = 0 ; j < levelList[i].size() ; j++) {
				res.add(levelList[i].get(j));				
			}
		}
		
		int lastIdx = res.size() - 1;
		while(res.get(lastIdx) == null) {
			res.remove(lastIdx);
			lastIdx = res.size() - 1;
		}
		
		//res.add(null);
		
		return res.toString();
	}
}
