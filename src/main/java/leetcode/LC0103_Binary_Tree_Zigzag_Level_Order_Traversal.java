package leetcode;

import java.util.*;

public class LC0103_Binary_Tree_Zigzag_Level_Order_Traversal {
    private List<List<Integer>> list;

    private void recur(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (list.size() < depth) {
            list.add(new ArrayList<>());
        }

        recur(root.left,  depth + 1);
        List<Integer> temp = list.get(depth - 1);
        temp.add(root.val);
        recur(root.right, depth + 1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        list = new ArrayList<>();
        recur(root, 1);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(list.get(i));
            }
        }
        return list;
    }
}
