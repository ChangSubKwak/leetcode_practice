package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LC0112_Path_Sum_Test {

	@Test
	void test() {
		LC0112_Path_Sum test = new LC0112_Path_Sum();

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		Assertions.assertThat(test.hasPathSum(root, 22)).isTrue();

		// Example 2
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		Assertions.assertThat(test.hasPathSum(root, 5)).isFalse();

	}
}
