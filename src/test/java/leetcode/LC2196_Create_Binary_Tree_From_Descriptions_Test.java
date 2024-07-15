package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2196_Create_Binary_Tree_From_Descriptions_Test {


    @Test
    void exampleTest1() {
        LC2196_Create_Binary_Tree_From_Descriptions test = new LC2196_Create_Binary_Tree_From_Descriptions();

        TreeNode expected = new TreeNode(50);
        expected.left = new TreeNode(20);
        expected.left.left = new TreeNode(15);
        expected.left.right = new TreeNode(17);

        expected.right = new TreeNode(80);
        expected.right.left = new TreeNode(19);

        assertThat(test.createBinaryTree(new int[][]{
                {20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}
        })).isEqualTo(expected);
    }

    @Test
    void exampleTest2() {
        LC2196_Create_Binary_Tree_From_Descriptions test = new LC2196_Create_Binary_Tree_From_Descriptions();

        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.left.right = new TreeNode(3);
        expected.left.right.left = new TreeNode(4);

        assertThat(test.createBinaryTree(new int[][]{
                {1, 2, 1}, {2, 3, 0}, {3, 4, 1}
        })).isEqualTo(expected);
    }
}
