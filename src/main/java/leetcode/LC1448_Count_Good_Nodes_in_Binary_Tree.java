package leetcode;

public class LC1448_Count_Good_Nodes_in_Binary_Tree {
    private int count;

    private void recur(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (max <= root.val) {
            max = root.val;
            count++;
        }
        recur(root.left, max);
        recur(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        count = 0;
        recur(root, root.val);

        return count;
    }
}
