package leetcode;

public class LC0814_Binary_Tree_Pruning {
    private void recur(TreeNode root, TreeNode parent, String direction) {
        if (root == null) {
            return;
        }

        recur(root.left, root, "left");
        recur(root.right, root, "right");

        if (root.val == 0 && root.left == null && root.right == null) {
            if (parent != null && direction.equals("left")) {
                parent.left = null;
            }
            else if (parent != null && direction.equals("right")) {
                parent.right = null;
            }
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        recur(root, null, "");
        if (root.val == 0 && root.left == null && root.right == null) {
            root = null;
        }

        return root;
    }
}
