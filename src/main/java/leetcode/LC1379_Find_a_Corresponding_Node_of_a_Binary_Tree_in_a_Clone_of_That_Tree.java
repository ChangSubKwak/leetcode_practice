package leetcode;

public class LC1379_Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
    private TreeNode ans;
    
    private void recursive(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return;
        }
        
        if (original == target) {
            ans = cloned;
        }
        
        recursive(original.left, cloned.left, target);
        recursive(original.right, cloned.right, target);
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        recursive(original, cloned, target);
        return ans;
    }
}
