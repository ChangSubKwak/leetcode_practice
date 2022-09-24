package leetcode;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC0113_Path_Sum_II_Test {
	LC0113_Path_Sum_II test;
	
	@Test
	void test() {
		test = new LC0113_Path_Sum_II();

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.left.right = new TreeNode(7);

		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);

		Assertions.assertThat(test.pathSum(root, 22)).isEqualTo(
			Arrays.asList(
				Arrays.asList(5, 4, 11, 2),
				Arrays.asList(5, 8, 4, 5)
			)
		);

		// Example 2
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		Assertions.assertThat(test.pathSum(root, 5)).isEmpty();;

		// Example 3
		root = new TreeNode(1);
		root.left = new TreeNode(2);

		Assertions.assertThat(test.pathSum(root, 0)).isEmpty();;
	}
}
