package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0145_Binary_Tree_Preorder_Traversal {
    private List<Integer> result;
    
    public void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        
        recursive(root.left);
        recursive(root.right);
        result.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        recursive(root);
        return result;
    }
}
