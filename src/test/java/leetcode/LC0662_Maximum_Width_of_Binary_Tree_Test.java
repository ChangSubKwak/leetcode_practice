package leetcode;

import static org.assertj.core.api.Assertions.*;


import org.junit.jupiter.api.*;

class LC0662_Maximum_Width_of_Binary_Tree_Test {
	@Test
	void minimumTotal() {
		LC0662_Maximum_Width_of_Binary_Tree test = new LC0662_Maximum_Width_of_Binary_Tree();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);

		root.right = new TreeNode(2);
		root.right.right = new TreeNode(9);

		assertThat(test.widthOfBinaryTree(root)).isEqualTo(4);

		root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.left.left = new TreeNode(6);

		root.right = new TreeNode(2);
		root.right.right = new TreeNode(9);
		root.right.right.left = new TreeNode(7);
		assertThat(test.widthOfBinaryTree(root)).isEqualTo(7);

		root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);

		root.right = new TreeNode(2);
		assertThat(test.widthOfBinaryTree(root)).isEqualTo(2);
	}
}
