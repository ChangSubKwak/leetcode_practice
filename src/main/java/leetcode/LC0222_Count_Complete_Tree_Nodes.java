package leetcode;

public class LC0222_Count_Complete_Tree_Nodes {
    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + recur(root.left) + recur(root.right);
    }

    public int countNodes(TreeNode root) {
        return recur(root);
    }
}
