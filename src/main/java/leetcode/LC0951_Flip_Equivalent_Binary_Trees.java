package leetcode;

public class LC0951_Flip_Equivalent_Binary_Trees {
    private boolean recur(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 == null) {
            return false;
        }

        if (root1 == null && root2 != null) {
            return false;
        }

        if (root1 == null) {
            return true;
        }

        if (root1.val != root2.val) {
            return false;
        }

        if (root1.left == null && root1.right == null) {
            return root2.left == null && root2.right == null;
        }

        if (root2.left == null && root2.right == null) {
            return false;
        }

        if (root1.left == null) {
            if (root2.left == null && root1.right.val == root2.right.val) {
                return recur(root1.right, root2.right);
            }

            if (root2.right == null && root1.right.val == root2.left.val) {
                return recur(root1.right, root2.left);
            }
            return false;
        }

        if (root1.right == null) {
            if (root2.left == null && root1.left.val == root2.right.val) {
                return recur(root1.left, root2.right) && recur(root1.left, root2.right);
            }

            if (root2.right == null && root1.left.val == root2.left.val) {
                return recur(root1.left, root2.left) && recur(root1.right, root2.right);
            }
            return false;
        }

        if (root2.left == null) {
            return false;
        }

        if (root2.right == null) {
            return false;
        }

        if (root1.left.val == root2.left.val && root1.right.val == root2.right.val) {
            return recur(root1.left, root2.left) && recur(root1.right, root2.right);
        }

        if (root1.left.val == root2.right.val && root1.right.val == root2.left.val) {
            return recur(root1.left, root2.right) && recur(root1.right, root2.left);
        }

        return false;
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return recur(root1, root2);
    }
}
