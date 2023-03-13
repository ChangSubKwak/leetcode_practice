package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0101_Symmetric_Tree {
    private List<List<Integer>> list;

    private void inorder(TreeNode root, int level) {
        if (list.size() < level) {
            list.add(new ArrayList<Integer>());
        }

        if (root == null) {
            list.get(level - 1).add(null);
            return;
        }

        inorder(root.left, level + 1);
        list.get(level - 1).add(root.val);
        inorder(root.right, level + 1);
    }

    public boolean isSymmetric(TreeNode root) {
        list = new ArrayList<>();
        inorder(root, 1);

        for (int i = 1; i < list.size(); i++) {
            List<Integer> level = list.get(i);

            if (level.size() % 2 != 0) {
                return false;
            }

            for (int j = 0, k = level.size() - 1; j < level.size(); j++, k--) {
                if (level.get(j) != level.get(k)) {
                    return false;
                }
            }
        }

        return true;
    }
}
