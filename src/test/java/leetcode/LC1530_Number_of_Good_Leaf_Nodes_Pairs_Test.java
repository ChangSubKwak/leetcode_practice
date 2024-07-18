package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1530_Number_of_Good_Leaf_Nodes_Pairs_Test {

	@Test
	void test1() {
		LC1530_Number_of_Good_Leaf_Nodes_Pairs test = new LC1530_Number_of_Good_Leaf_Nodes_Pairs();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(4);

		assertThat(test.countPairs(root, 3)).isEqualTo(3);
	}

	@Test
	void test2() {
		LC1530_Number_of_Good_Leaf_Nodes_Pairs test = new LC1530_Number_of_Good_Leaf_Nodes_Pairs();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		assertThat(test.countPairs(root, 3)).isEqualTo(2);
	}

	@Test
	void test3() {
		LC1530_Number_of_Good_Leaf_Nodes_Pairs test = new LC1530_Number_of_Good_Leaf_Nodes_Pairs();

		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(2);

		assertThat(test.countPairs(root, 3)).isEqualTo(1);
	}
}
