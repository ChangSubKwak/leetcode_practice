package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class LC0199_BinaryTreeRightSideView {
	List<List<Integer>> rightSideList;
	private void preOrder(TreeNode root, int depth) {
		if (root == null) {
			return;
		}

		if (rightSideList.size() < depth) {
			List<Integer> temp = new ArrayList<>();
			rightSideList.add(temp);
		}

		List<Integer> list = rightSideList.get(depth - 1);
		list.add(root.val);
		preOrder(root.left, depth + 1);
		preOrder(root.right, depth + 1);
	}

	public List<Integer> rightSideView(TreeNode root) {
		rightSideList = new ArrayList<>();
		preOrder(root, 1);
		List<Integer> result = rightSideList.stream()
			.map(e -> e.get(e.size() - 1))
			.collect(Collectors.toList())
			;

		return result;
	}

	/*
	List<Integer> list = new ArrayList<>();
	
	private void helper(TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		
		if (list.size() == depth) {
			list.add(root.val);
		}
		
		helper(root.right, depth + 1);
		helper(root.left, depth + 1);
	}

    public List<Integer> rightSideView(TreeNode root) {
    	helper(root, 0);
        return list;
    }

    */
}
