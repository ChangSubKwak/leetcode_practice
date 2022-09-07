package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LC0606_Construct_String_from_Binary_Test {
	LC0606_Construct_String_from_Binary test;
	
	@BeforeEach
	void setUp() {
		test = new LC0606_Construct_String_from_Binary();
	}
	
	@Test
	void test() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		Assertions.assertThat(test.tree2str(root)).isEqualTo("1(2(4))(3)");

		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		Assertions.assertThat(test.tree2str(root)).isEqualTo("1(2()(4))(3)");
	}
}
