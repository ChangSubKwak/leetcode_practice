package leetcode;

public class LC0124_BinaryTreeMaximumPathSum_X {
    int sum;
    
    public int maxPathSum(TreeNode root) {
        sum = -1000 * 30000;
        helper(root);
        return sum;
    }
    
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left  = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        sum = Math.max(sum, root.val + left + right);
        return Math.max(left, right) + root.val;
    }

	public static void main(String[] args) {
		LC0124_BinaryTreeMaximumPathSum_X t = new LC0124_BinaryTreeMaximumPathSum_X();
		TreeNode root = new TreeNode(1);
		root.left     = new TreeNode(2);
		root.right    = new TreeNode(3);
		
	}

}
