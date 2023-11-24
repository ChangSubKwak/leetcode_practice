package leetcode;

public class LC2265_Count_Nodes_Equal_to_Average_of_Subtree {
    private int result;
    
    public int[] recur(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        
        int[] left  = recur(root.left);
        int[] right = recur(root.right);
        int count = 1 + left[0] + right[0];
        int total = root.val + left[1] + right[1];
        int average = total / count;
        
        if (average == root.val) {
            result++;
        }
        
        return new int[]{count, total};
    }
    
    public int averageOfSubtree(TreeNode root) {
        result = 0;
        recur(root);
        return result;
    }
}
