package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0783_Minimum_Distance_Between_BST {
    public void recur(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        recur(root.left, list);
        recur(root.right, list);
    }

    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recur(root, list);

        // System.out.println("list = " + list);
        Collections.sort(list);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            if (min > diff) {
                min = diff;
            }
        }

        return min;
    }
}
