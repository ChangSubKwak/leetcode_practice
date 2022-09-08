package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0094_Binary_Tree_Inorder_Traversal_Test {
	LC0094_Binary_Tree_Inorder_Traversal test;
	
	@BeforeEach
	void setUp() {
		test = new LC0094_Binary_Tree_Inorder_Traversal();
	}
	
	@Test
	void test() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		assertThat(test.inorderTraversal(root)).isEqualTo(
			Arrays.asList(1, 3, 2)
		);

		root = null;
		assertThat(test.inorderTraversal(root)).isEqualTo(
			Arrays.asList()
		);

		root = new TreeNode(1);
		assertThat(test.inorderTraversal(root)).isEqualTo(
			Arrays.asList(1)
		);
	}
}
