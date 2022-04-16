package leetcode;

public class LC0538_Convert_BST_to_Greater_Tree {
    private int total = 0;
    
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        convertBST(root.right);
        total += root.val;
        root.val = total;
        convertBST(root.left);
        
        return root;
    }
}
