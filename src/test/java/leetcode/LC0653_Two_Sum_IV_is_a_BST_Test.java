package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0653_Two_Sum_IV_is_a_BST_Test {

	@Test
	void test() {
		LC0653_Two_Sum_IV_is_a_BST test = new LC0653_Two_Sum_IV_is_a_BST();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(7);

		assertThat(test.findTarget(root, 9)).isTrue();
		assertThat(test.findTarget(root, 28)).isFalse();
	}
}
