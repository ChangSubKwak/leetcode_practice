package leetcode;

public class LC0111_Minimum_Depth_of_Binary_Tree {
    private int recur(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth;
        }

        int min = 100001;
        if (root.left != null) {
            min = Math.min(min, recur(root.left, depth + 1));
        }

        if (root.right != null) {
            min = Math.min(min, recur(root.right, depth + 1));
        }

        return min;
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return recur(root, 1);
    }
}
