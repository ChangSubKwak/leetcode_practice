package main.java.leetcode;

public class LC0098_ValidateBinarySearchTree_X {
    public boolean isValidBST(TreeNode root, int min, int max) {
    	if (root == null)
    		return true;
    	
    	if (root.val <= min || max <= root.val)
    		return false;
    	
    	return isValidBST(root.left,  min, root.val) &&
    		   isValidBST(root.right, root.val, max);
    }
    
    public boolean isValidBST(TreeNode root) {
    	return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	public static void main(String[] args) {
		LC0098_ValidateBinarySearchTree_X t = new LC0098_ValidateBinarySearchTree_X();
//		TreeNode tn3 = new TreeNode(3);
//		TreeNode tn1 = new TreeNode(1);
//		TreeNode tn2 = new TreeNode(2, tn1, tn3);
//		System.out.println(t.isValidBST(tn2));
		
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn4 = new TreeNode(4, tn3, tn6);
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn5 = new TreeNode(5, tn1, tn4);
		System.out.println(t.isValidBST(tn5));
		
//		TreeNode tn3 = new TreeNode(3);
//		TreeNode tn7 = new TreeNode(7);
//		TreeNode tn6 = new TreeNode(6, tn3, tn7);
//		TreeNode tn4 = new TreeNode(4);
//		TreeNode tn5 = new TreeNode(5, tn4, tn6);
//		System.out.println(t.isValidBST(tn5));
	}
}
