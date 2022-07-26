package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0236_Lowest_Common_Ancestor_of_a_Binary_Tree {
    private boolean recursive(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null) {
            return false;
        }
        
        if (root == target) {
            list.add(root);
            return true;
        }
        
        boolean isLeftSearched = recursive(root.left, target, list);
        boolean isRightSearched = recursive(root.right, target, list);
        
        if (isLeftSearched) {
            list.add(root);
        }
        
        if (isRightSearched) {
            list.add(root);
        }
        
        return isLeftSearched || isRightSearched;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l1 = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();
        
        recursive(root, p, l1);
        recursive(root, q, l2);

        TreeNode result = null;
        start :
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).val == l2.get(j).val) {
                    result = l1.get(i);
                    break start;
                }
            }
        }
        
        return result;
    }
}
