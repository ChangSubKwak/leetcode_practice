package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0100_Same_Tree_Test {
	@Test
	void test() {
		LC0100_Same_Tree test = new LC0100_Same_Tree();

		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);

		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);

		assertThat(test.isSameTree(p, q)).isTrue();

		p = new TreeNode(1);
		p.left = new TreeNode(2);

		q = new TreeNode(1);
		q.right = new TreeNode(2);

		assertThat(test.isSameTree(p, q)).isFalse();

		p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(1);

		q = new TreeNode(1);
		q.left = new TreeNode(1);
		q.right = new TreeNode(2);

		assertThat(test.isSameTree(p, q)).isFalse();
	}
}
