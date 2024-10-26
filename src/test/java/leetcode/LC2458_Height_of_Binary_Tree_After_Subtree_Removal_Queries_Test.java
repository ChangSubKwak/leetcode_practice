package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC2458_Height_of_Binary_Tree_After_Subtree_Removal_Queries_Test {

    LC2458_Height_of_Binary_Tree_After_Subtree_Removal_Queries test = new LC2458_Height_of_Binary_Tree_After_Subtree_Removal_Queries();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);

        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(7);

        assertThat(test.treeQueries(root, new int[]{4})).isEqualTo(new int[]{2});
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(6);

        root.right = new TreeNode(9);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);

        assertThat(test.treeQueries(root, new int[]{3, 2, 4, 8})).isEqualTo(new int[]{3, 2, 3, 2});
    }
}
