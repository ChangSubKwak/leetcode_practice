package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level_Test {
    @Test
    void test1() {
        LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level test = new LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(4);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(5);

        root.right.left.left = new TreeNode(9);
        root.right.right.left = new TreeNode(10);

        assertThat(test.minimumOperations(root)).isEqualTo(3);
    }

    @Test
    void test2() {
        LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level test = new LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        assertThat(test.minimumOperations(root)).isEqualTo(3);
    }

    @Test
    void test3() {
        LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level test = new LC2471_Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);

        assertThat(test.minimumOperations(root)).isEqualTo(0);
    }
}
