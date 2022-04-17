package leetcode;

public class LC0897_Increasing_Order_Search_Tree {
    private TreeNode res = null;
    private TreeNode head;
    
    public void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        recursive(root.left);
        
        if (res == null) {
            res = new TreeNode(root.val);
            head = res;
        } else {
            res.right = new TreeNode(root.val);
            res = res.right;
        }
        recursive(root.right);
    }
    
    public TreeNode increasingBST(TreeNode root) {
        recursive(root);
        return head;
    }
}
