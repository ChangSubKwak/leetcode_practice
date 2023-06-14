package leetcode;

import java.util.*;

public class LC0530_Minimum_Absolute_Difference_in_BST {
    private PriorityQueue<Integer> priorityQueue;

    private void recur(TreeNode root) {
        if (root == null) {
            return;
        }

        recur(root.left);
        priorityQueue.add(root.val);
        recur(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        priorityQueue = new PriorityQueue<>();

        recur(root);

        Iterator value = priorityQueue.iterator();
        int first  = (Integer)(value.next());
        int second = (Integer)(value.next());
        int min = second - first;
        while (value.hasNext()) {
            first  = second;
            second = (Integer)(value.next());
            if (min > (second - first)) {
                min = second - first;
            }
        }

        return min;
    }
}
