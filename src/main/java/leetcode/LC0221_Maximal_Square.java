package leetcode;

public class LC0221_Maximal_Square {
    private int count;
    
    private int inorder(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        
        if (root.right == null) {
            count = root.left.val;
            return 1;
        }
        
        return inorder(root.left) + inorder(root.right);
    }
    
    public int countNodes(TreeNode root) {
        count = 0;
        inorder(root);
        return count;
    }
}
