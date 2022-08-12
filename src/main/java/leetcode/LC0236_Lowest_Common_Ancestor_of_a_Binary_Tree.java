package leetcode;

import java.util.*;

public class LC0236_Lowest_Common_Ancestor_of_a_Binary_Tree {
    /*
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

    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();

        TreeNode temp = root;
        while(temp != null) {
            list1.add(temp);
            if (temp.val == p.val) {
                break;
            }
            if (temp.val > p.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        System.out.println(list1);

        temp = root;
        while(temp != null) {
            list2.add(temp);
            if (temp.val == q.val) {
                break;
            }
            if (temp.val > q.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        Collections.reverse(list1);
        Collections.reverse(list2);

        int index = -1;
        start:
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    index = i;
                    break start;
                }
            }
        }

        return list1.get(index);
    }
}
