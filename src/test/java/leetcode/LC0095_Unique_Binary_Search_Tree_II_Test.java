package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0095_Unique_Binary_Search_Tree_II_Test {
	@Test
	void test() {
		LC0095_Unique_Binary_Search_Tree_II test = new LC0095_Unique_Binary_Search_Tree_II();

		List<TreeNode> answer = new ArrayList<>();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		answer.add(root);

		root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		answer.add(root);

		root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		answer.add(root);

		root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		answer.add(root);

		root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		answer.add(root);

		assertThat(test.generateTrees(3)).isEqualTo(answer);

		root = new TreeNode(1);
		answer.clear();
		answer.add(root);

		assertThat(test.generateTrees(1)).isEqualTo(answer);
	}
}
