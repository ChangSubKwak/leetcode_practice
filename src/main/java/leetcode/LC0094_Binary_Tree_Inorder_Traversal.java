package leetcode;

import java.util.*;

public class LC0094_Binary_Tree_Inorder_Traversal {
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
}
