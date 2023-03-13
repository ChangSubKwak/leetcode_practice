package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0101_Symmetric_Tree_Test {
	@Test
	void test() {
		LC0101_Symmetric_Tree test = new LC0101_Symmetric_Tree();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		assertThat(test.isSymmetric(root)).isTrue();

		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);

		assertThat(test.isSymmetric(root)).isFalse();
	}
}
