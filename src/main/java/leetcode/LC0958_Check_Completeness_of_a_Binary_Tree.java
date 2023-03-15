package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LC0958_Check_Completeness_of_a_Binary_Tree {
    private List<List<Integer>> list;

    private void inorder(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (list.size() <= depth) {
            list.add(new ArrayList<>());
        }

        if (root.left == null) {
            list.get(depth).add(null);
        } else {
            list.get(depth).add(root.left.val);
        }

        if (root.right == null) {
            list.get(depth).add(null);
        } else {
            list.get(depth).add(root.right.val);
        }

        inorder(root.left, depth + 1);
        inorder(root.right, depth + 1);
    }

    public boolean isCompleteTree(TreeNode root) {
        list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(root.val);

        inorder(root, 1);
        List<Integer> flatted = list.stream().flatMap(List::stream).collect(Collectors.toList());

        while (flatted.get(flatted.size() - 1) == null) {
            flatted.remove(flatted.size() - 1);
        }

        if (list.get(list.size() - 1).size() == 0) {
            list.remove(list.size() - 1);
        }

        if (flatted.contains(null)) {
            return false;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).size() != (int)Math.pow(2, i)) {
                return false;
            }
        }

        return true;
    }
}
