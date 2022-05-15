package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1302_Deepest_Leaves_Sum {
    private int maxDepth;
    private int sum;
    
    private void recursive(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (maxDepth < depth) {
            maxDepth = depth;
        }
        
        if (maxDepth == depth) {
            sum += root.val;
        }
        
        recursive(root.left , depth + 1);
        recursive(root.right, depth + 1);
    }
        
    
    public int deepestLeavesSum(TreeNode root) {
        maxDepth = 0;
        recursive(root, 1);
        sum = 0;
        recursive(root, 1);
        
        return sum;
    }
}
