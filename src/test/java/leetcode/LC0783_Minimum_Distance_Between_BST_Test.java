package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0783_Minimum_Distance_Between_BST_Test {
	@Test
	void test() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		LC0783_Minimum_Distance_Between_BST test = new LC0783_Minimum_Distance_Between_BST();
		assertThat(test.minDiffInBST(root)).isEqualTo(1);

		root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(48);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(49);
		assertThat(test.minDiffInBST(root)).isEqualTo(1);
	}
}
