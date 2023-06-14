package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0530_Minimum_Absolute_Difference_in_BST_Test {
	@Test
	void test() {
		LC0530_Minimum_Absolute_Difference_in_BST test = new LC0530_Minimum_Absolute_Difference_in_BST();

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left  = new TreeNode(1);
		root.left.right = new TreeNode(3);

		assertThat(test.getMinimumDifference(root)).isEqualTo(1);

		root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(48);
		root.right.left  = new TreeNode(12);
		root.right.right = new TreeNode(49);

		assertThat(test.getMinimumDifference(root)).isEqualTo(1);
	}
}
