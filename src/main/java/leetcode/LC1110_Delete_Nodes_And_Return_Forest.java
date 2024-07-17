package leetcode;

import java.util.*;

public class LC1110_Delete_Nodes_And_Return_Forest {
    private List<TreeNode> result;

    private boolean recur(TreeNode root, Set<Integer> set) {
        if (root == null) {
            return false;
        }

        if (recur(root.left, set)) {
            root.left = null;
        }

        if (recur(root.right, set)) {
            root.right = null;
        }

        if (set.contains(root.val)) {
            if (root.left != null) {
                result.add(root.left);
            }

            if (root.right != null) {
                result.add(root.right);
            }

            return true;
        }

        return false;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<Integer> list = Arrays.asList(Arrays.stream(to_delete).boxed().toArray(Integer[]::new));
        Set<Integer> set = new HashSet<>(list);

        result = new ArrayList<>();

        if (!set.contains(root.val)) {
            result.add(root);
        }

        recur(root, set);

//        System.out.println(result.size());

        return result;
    }
}
