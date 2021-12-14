package leetcode;

public class LC0938_Range_Sum_of_BST {
    private int sum;
    
    public void recursive(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        
        recursive(root.left, low, high);
        recursive(root.right, low, high);
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        recursive(root, low, high);
        
        return sum;
    }
}
