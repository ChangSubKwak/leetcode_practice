package leetcode;

public class LC0700_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        
        if (val == root.val ) {
            return root;
        }
        
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        
        return searchBST(root.right, val);
    }
}
