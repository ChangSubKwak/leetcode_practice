package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0173_Binary_Search_Tree_Iterator {
	class BSTIterator {
	    private List<Integer> list;
	    private int i = 0;
	    
	    private void inorder(TreeNode root) {
	        if (root == null) {
	            return;
	        }
	        inorder(root.left);
	        list.add(root.val);
	        inorder(root.right);
	    }
	
	    public BSTIterator(TreeNode root) {
	        list = new ArrayList<>();
	        inorder(root);
	    }
	    
	    public int next() {
	        return list.get(i++);
	    }
	    
	    public boolean hasNext() {
	        return i < list.size();
	    }
	}
}
