package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0144_Binary_Tree_Postorder_Traversal {
    private List<Integer> result;
    
    public void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        
        result.add(root.val);
        recursive(root.left);
        recursive(root.right);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        recursive(root);
        return result;
    }
}
