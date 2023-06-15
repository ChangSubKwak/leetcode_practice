package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1161_Maximum_Level_Sum_of_a_Binary_Tree_Test {
    @Test
    void test() {
        LC1161_Maximum_Level_Sum_of_a_Binary_Tree test = new LC1161_Maximum_Level_Sum_of_a_Binary_Tree();

        TreeNode root = new TreeNode(1);
        root.left  = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left  = new TreeNode(7);
        root.left.right  = new TreeNode(-8);
        assertThat(test.maxLevelSum(root)).isEqualTo(2);

        root = new TreeNode(989);
        root.right = new TreeNode(10250);
        root.right.left = new TreeNode(98693);
        root.right.right = new TreeNode(-89388);
        root.right.right.right = new TreeNode(-32127);
        assertThat(test.maxLevelSum(root)).isEqualTo(2);
    }
}
