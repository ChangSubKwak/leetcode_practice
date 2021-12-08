package leetcode;

public class LC0563_Binary_Tree_Tilt {
    private int sum;
    
    public int recursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftSum  = recursive(root.left);
        int rightSum = recursive(root.right);
        sum += Math.abs(leftSum - rightSum);
        
        return leftSum + rightSum + root.val;
    }
    
    public int findTilt(TreeNode root) {
        sum = 0;
        recursive(root);
        return sum;
    }
}
