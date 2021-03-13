package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0107_BinaryTreeLevelOrderTraversalII {
	public static List<List<Integer>> result;
	
	public void traverse(TreeNode root, int depth) {
		if (root == null)
			return;
		
		if (result.size() < depth + 1 ) {
			List<Integer> temp = new ArrayList<Integer>();
			result.add(temp);
		}
		
		result.get(depth).add(root.val);
		traverse(root.left, depth + 1);
		traverse(root.right, depth + 1);
	}
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	result = new ArrayList<>();
    	traverse(root, 0);
    	Collections.reverse(result);
        return result;
    }
	
	public static void main(String[] args) {
		LC0107_BinaryTreeLevelOrderTraversalII t = new LC0107_BinaryTreeLevelOrderTraversalII();
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(20);
		TreeNode t3 = new TreeNode(15);
		TreeNode t4 = new TreeNode(7);
		
		t2.left  = t3;
		t2.right = t4;
		
		root.left  = t1;
		root.right = t2;
		System.out.println(t.levelOrderBottom(root));
		//System.out.println(root.constructLevelList());
		//System.out.println(t.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7}));
	}
}
