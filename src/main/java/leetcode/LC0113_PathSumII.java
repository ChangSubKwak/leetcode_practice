package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0113_PathSumII {
	public List<List<Integer>> res;
	
	public void traverse(TreeNode root, List<Integer> curr, int sum, int accSum) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			if (sum == accSum + root.val ) {
				curr.add(root.val);
				res.add(new ArrayList<>(curr));
				curr.remove(curr.size() - 1);
			}
			return;
		}
		
		curr.add(root.val);
		traverse(root.left, curr, sum, accSum + root.val);
		traverse(root.right, curr, sum, accSum + root.val);
		curr.remove(curr.size() - 1);
	}
	
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    	if (root == null) return new ArrayList<>();
    	res = new ArrayList<>();
    	traverse(root, new ArrayList<Integer>(), targetSum, 0);
//    	System.out.println(res);
        return res;
    }
	
	public static void main(String[] args) {
		LC0113_PathSumII t = new LC0113_PathSumII();
		
		TreeNode root = new TreeNode(5);
		TreeNode ta4 = new TreeNode(4);
		TreeNode t11 = new TreeNode(11);
		TreeNode t7 = new TreeNode(7);
		TreeNode t2 = new TreeNode(2);
		TreeNode t8 = new TreeNode(8);
		TreeNode t13 = new TreeNode(13);
		TreeNode tb4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t1 = new TreeNode(1);
		
		root.left  = ta4;
		ta4.left = t11;
		t11.left = t7;
		t11.right = t2;
		
		root.right = t8;
		t8.left = t13;
		t8.right = tb4;
		tb4.left = t5;
		tb4.right = t1;
		System.out.println(t.pathSum(root, 22));
		
//		TreeNode root = new TreeNode(1);
//		TreeNode t2 = new TreeNode(2);
//		TreeNode t3 = new TreeNode(3);
//
//		root.left = t2;
//		root.right = t3;
//		System.out.println(t.pathSum(root, 5));
		
//		TreeNode root = new TreeNode(1);
//		TreeNode t2 = new TreeNode(2);
//
//		root.left = t2;
//		System.out.println(t.pathSum(root, 1));
	}
}
