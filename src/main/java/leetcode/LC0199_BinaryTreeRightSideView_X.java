package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0199_BinaryTreeRightSideView_X {
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

	public static void main(String[] args) {
		LC0199_BinaryTreeRightSideView_X t = new LC0199_BinaryTreeRightSideView_X();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		
		t1.left = t2;
		t1.right = t3;
		t2.right = t5;
		t3.right = t4;
		t2.left = t4;
		
		System.out.println(t.rightSideView(t1));
	}
}
