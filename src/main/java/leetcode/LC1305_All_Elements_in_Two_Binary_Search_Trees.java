package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1305_All_Elements_in_Two_Binary_Search_Trees {
    private List<Integer> list;
    
    private void inorder(TreeNode root) {
        if (root == null) {
            return ;
        }
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        inorder(root1);
        inorder(root2);
        Collections.sort(list);
        return list;
    }
}
