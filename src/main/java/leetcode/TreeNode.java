package leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	int maxDepth;
	List<Integer> list;
	ArrayList<Integer>[] levelList;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public void inorder(TreeNode root) {
		if (root == null) return;
		inorder(root.left);
		list.add( root.getVal() );
		inorder(root.right);
	}
	
	public List<Integer> executeAndGetInOrderResult() {
		list = new ArrayList<>();
		inorder(this);
		return list;
	}
	
	public void preorder(TreeNode root) {
		if (root == null) return;
		list.add( root.getVal() );
		preorder(root.left);
		preorder(root.right);
	}
	
	public List<Integer> executeAndGetPreOrderResult() {
		list = new ArrayList<>();
		preorder(this);
		return list;
	}
	
	public void traverseLevel(TreeNode root, int depth) {
		if (root == null) {
			levelList[depth].add( null );
			return;
		}
		levelList[depth].add( root.getVal() );
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
		
		return res.toString();
	}
	
	private boolean traverseForEquality(TreeNode source, TreeNode target) {
		if (source == null && target == null) {
			return true;
		}
		
		if (source != null && target == null) {
			return false;
		}
		
		if (source == null && target != null) {
			return false;
		}
		
		if (source.val != target.val) {
			return false;
		}
		
		return traverseForEquality(source.left, target.left) && traverseForEquality(source.right, target.right);
	}
	
	@Override
	public boolean equals(Object obj) {
		return traverseForEquality(this, (TreeNode)obj);
	}
	
	@Override
	public String toString() {
		//return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]\n";
		return "[" + val + "," + left + "," + right + "]";
	}

}
