package leetcode;

public class LC0701_InsertintoaBinarySearchTree {
    private void recursive(TreeNode root, TreeNode parent, char direction, int val) {
        if (root == null && direction == 'L') {
            root = new TreeNode(val);
            parent.left = root;
            return;
        }
        
        if (root == null && direction == 'R') {
            root = new TreeNode(val);
            parent.right = root;
            return;
        }
        
        
        if (root.val > val) {
            recursive(root.left, root, 'L', val);
            return;
        }
        recursive(root.right, root, 'R', val);
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        recursive(root, null, 'M', val);
        return root;
    }
}
