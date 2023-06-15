package leetcode;

import java.util.*;

public class LC1161_Maximum_Level_Sum_of_a_Binary_Tree {
    private Map<Integer, Integer> map;

    private void recur(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        map.put(level, map.getOrDefault(level, 0) + root.val);

        recur(root.left,  level + 1);
        recur(root.right, level + 1);
    }

    public int maxLevelSum(TreeNode root) {
        map = new HashMap<>();
        recur(root, 1);

        int maxKey = 1;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }
}
