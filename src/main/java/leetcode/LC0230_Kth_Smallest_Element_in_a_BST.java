package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class LC0230_Kth_Smallest_Element_in_a_BST {
    private Set<Integer> set = new TreeSet<>();
    
    private void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        
        set.add(root.val);
        recursive(root.left);
        recursive(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        recursive(root);
        
        int index = 0;
        for (Integer i : set) {
            index++;
            if (index == k) {
                return i;
            }
        }
        
        return -1;
    }
}
