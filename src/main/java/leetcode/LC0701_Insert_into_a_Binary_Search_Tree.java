package leetcode;

public class LC0701_Insert_into_a_Binary_Search_Tree {
    private void recursive(TreeNode root, int val) {
        if (root == null) {
            // root = new TreeNode(val);
            return;
        }
        
        if (root.val > val) {
            recursive(root.left, val);
            if (root.left == null) {
                root.left = new TreeNode(val);
            }
        }
        
        if (root.val < val) {
            recursive(root.right, val);
            if (root.right == null) {
                root.right = new TreeNode(val);
            }
        }
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        recursive(root, val);
        return root;
    }
	
	/*
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
    */
}
