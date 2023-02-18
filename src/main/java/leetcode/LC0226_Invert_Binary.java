package leetcode;

public class LC0226_Invert_Binary {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left =  invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
