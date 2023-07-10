package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0111_Minimum_Depth_of_Binary_Tree_Test {

	@Test
	void test() {
		LC0111_Minimum_Depth_of_Binary_Tree test = new LC0111_Minimum_Depth_of_Binary_Tree();

		TreeNode root = new TreeNode(3);
		root.left  = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		assertThat(test.minDepth(root)).isEqualTo(2);

		root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(6);
		assertThat(test.minDepth(root)).isEqualTo(5);

	}
}
