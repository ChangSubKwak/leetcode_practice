package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0652_Find_Duplicate_Subtrees_Test {

	@Test
	void test() {
		LC0652_Find_Duplicate_Subtrees test = new LC0652_Find_Duplicate_Subtrees();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(4);
		root.right.left.left = new TreeNode(4);

		TreeNode answer1 = new TreeNode(2);
		answer1.left = new TreeNode(4);
		TreeNode answer2 = new TreeNode(4);

		assertThat(test.findDuplicateSubtrees(root)).containsAll(
			Arrays.asList(answer1, answer2)
		);
	}
}
