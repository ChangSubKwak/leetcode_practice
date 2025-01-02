package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0515_Find_largest_Value_in_Each_Tree_Row_Test {
	@Test
	void test1() {
		LC0515_Find_largest_Value_in_Each_Tree_Row test = new LC0515_Find_largest_Value_in_Each_Tree_Row();

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(3);
		root.right = new TreeNode(2);

		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);

		root.left.left = new TreeNode(9);

		assertThat(test.largestValues(root)).isEqualTo(Arrays.asList(1, 3, 9));
	}

	@Test
	void test2() {
		LC0515_Find_largest_Value_in_Each_Tree_Row test = new LC0515_Find_largest_Value_in_Each_Tree_Row();

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		assertThat(test.largestValues(root)).isEqualTo(Arrays.asList(1, 3));
	}
}
