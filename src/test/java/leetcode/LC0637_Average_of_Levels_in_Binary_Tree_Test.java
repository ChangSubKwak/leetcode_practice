package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0637_Average_of_Levels_in_Binary_Tree_Test {
	LC0637_Average_of_Levels_in_Binary_Tree test;
	
	@BeforeEach
	void setUp() {
		test = new LC0637_Average_of_Levels_in_Binary_Tree();
	}
	
	@Test
	void test() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(29);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		Assertions.assertThat(test.averageOfLevels(root)).isEqualTo(Arrays.asList(3.0, 14.5, 11.0));
	}
}
