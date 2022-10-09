package leetcode;

import java.util.*;

public class LC0653_Two_Sum_IV_is_a_BST {
    private List<Integer> nums;

    private void recur(TreeNode root) {
        if  (root == null) {
            return;
        }
        nums.add(root.val);
        recur(root.left);
        recur(root.right);
    }

    public boolean findTarget(TreeNode root, int k) {
        nums = new ArrayList<>();

        recur(root);
        Collections.sort(nums);

        if (nums.size() == 1) {
            return false;
        }

        for (int i = 0; i < nums.size(); i++) {
            int anotherNum = k - nums.get(i);

            int index1 = Collections.binarySearch(nums, nums.get(i));
            int index2 = Collections.binarySearch(nums, anotherNum);
            if (index1 != index2 && index2 >= 0) {
                return true;
            }
        }

        return false;
    }
}
