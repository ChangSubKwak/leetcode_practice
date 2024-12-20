package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2415_Reverse_Odd_Levels_of_Binary_Tree_Test {
    @Test
    void exampleTest1() {
        LC2415_Reverse_Odd_Levels_of_Binary_Tree test = new LC2415_Reverse_Odd_Levels_of_Binary_Tree();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);

        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(5);
        expected.right = new TreeNode(3);

        expected.left.left = new TreeNode(8);
        expected.left.right = new TreeNode(13);

        expected.right.left = new TreeNode(21);
        expected.right.right = new TreeNode(34);

        assertThat(test.reverseOddLevels(root)).isEqualTo(expected);
    }

    @Test
    void exampleTest2() {
        LC2415_Reverse_Odd_Levels_of_Binary_Tree test = new LC2415_Reverse_Odd_Levels_of_Binary_Tree();

        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(13);
        root.right = new TreeNode(11);

        TreeNode expected = new TreeNode(7);
        expected.left = new TreeNode(11);
        expected.right = new TreeNode(13);

        assertThat(test.reverseOddLevels(root)).isEqualTo(expected);
    }

    @Test
    void exampleTest3() {
        LC2415_Reverse_Odd_Levels_of_Binary_Tree test = new LC2415_Reverse_Odd_Levels_of_Binary_Tree();

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);

        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(2);

        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);

        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(1);
        expected.right = new TreeNode(2);

        expected.left.left = new TreeNode(0);
        expected.left.right = new TreeNode(0);

        expected.right.left = new TreeNode(0);
        expected.right.right = new TreeNode(0);

        expected.left.left.left = new TreeNode(2);
        expected.left.left.right = new TreeNode(2);
        expected.left.right.left = new TreeNode(2);
        expected.left.right.right = new TreeNode(2);

        expected.right.left.left = new TreeNode(1);
        expected.right.left.right = new TreeNode(1);
        expected.right.right.left = new TreeNode(1);
        expected.right.right.right = new TreeNode(1);

        assertThat(test.reverseOddLevels(root)).isEqualTo(expected);
    }
}
