package leetcode;

public class LC0700_SearchinaBinarySearchTree {
    private TreeNode recursive(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        
        if (root.val == val) {
            return root;
        }
        
        if (root.val > val) {
            return recursive(root.left, val);
        }
        return recursive(root.right, val);
    }
    
    public TreeNode searchBST(TreeNode root, int val) {
        return recursive(root, val);
    }
}
