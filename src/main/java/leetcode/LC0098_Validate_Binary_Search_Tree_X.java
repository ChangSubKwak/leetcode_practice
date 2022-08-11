package leetcode;

public class LC0098_Validate_Binary_Search_Tree_X {
	private boolean traverse(TreeNode root) {
		if (root == null) {
			return true;
		}

		if (root.left != null && root.val <= root.left.val) {
			return false;
		}

		if (root.right != null && root.val >= root.right.val) {
			return false;
		}

		traverse(root.left);
		traverse(root.right);

		return true;
	}

	public boolean isValidBST(TreeNode root) {
		return traverse(root);
	}

	/*
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
    */
}
