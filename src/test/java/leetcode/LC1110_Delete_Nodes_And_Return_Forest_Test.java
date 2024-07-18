package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC1110_Delete_Nodes_And_Return_Forest_Test {
    
    @Test
    void test1() {
        LC1110_Delete_Nodes_And_Return_Forest test = new LC1110_Delete_Nodes_And_Return_Forest();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode expected1 = new TreeNode(1);
        expected1.left = new TreeNode(2);
        expected1.left.left = new TreeNode(4);

        TreeNode expected2 = new TreeNode(6);
        TreeNode expected3 = new TreeNode(7);
        
        assertThat(test.delNodes(root, new int[]{3, 5})).containsAll(Arrays.asList(expected1, expected2, expected3));
    }

    @Test
    void test2() {
        LC1110_Delete_Nodes_And_Return_Forest test = new LC1110_Delete_Nodes_And_Return_Forest();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(3);

        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(4);

        assertThat(test.delNodes(root, new int[]{3})).containsAll(Arrays.asList(expected));
    }
}
