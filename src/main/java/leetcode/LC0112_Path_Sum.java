package leetcode;

public class LC0112_Path_Sum {
    private boolean recur(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == (sum + root.val);
        }

        sum += root.val;
        return  recur(root.left, targetSum, sum) || recur(root.right, targetSum, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return recur(root, targetSum, 0);
    }
}
