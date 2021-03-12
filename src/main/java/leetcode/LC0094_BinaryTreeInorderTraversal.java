package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LC0094_BinaryTreeInorderTraversal {
	// Âü°í
	/*
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
	//*/
	
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	Set<TreeNode> visit = new HashSet<>();
    	
    	if (root == null) return res; 
    	
    	stack.add(root);
    	TreeNode t = null;
    	while(!stack.isEmpty()) {
    		t = stack.peek();
    		if (t.left != null && !visit.contains(t.left)) {
    			stack.add(t.left);
    			continue;
    		}
    		
    		if (!visit.contains(t))
    			res.add(t.val);
   			visit.add(t);
    		
    		if (t.right != null && !visit.contains(t.right)) {
    			stack.add(t.right);
    			continue;
    		}
    		
    		visit.add(stack.pop());
    	}
    	return res;
    }
	
	public static void main(String[] args) {
		LC0094_BinaryTreeInorderTraversal t = new LC0094_BinaryTreeInorderTraversal();
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn2 = new TreeNode(2, tn3, null);
		TreeNode tn1 = new TreeNode(1, null, tn2);
		System.out.println(t.inorderTraversal(tn1));
		System.out.println(t.inorderTraversal(null));
		System.out.println(t.inorderTraversal(new TreeNode(1, null, null)));
		System.out.println(t.inorderTraversal(new TreeNode(1, new TreeNode(2), null)));
		System.out.println(t.inorderTraversal(new TreeNode(1, null, new TreeNode(2))));
		System.out.println(t.inorderTraversal(new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), null)));
	}
}
