package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0863_All_Nodes_Distance_K_in_Binary_Tree_Test {
    @Test
    void test() {
        LC0863_All_Nodes_Distance_K_in_Binary_Tree test = new LC0863_All_Nodes_Distance_K_in_Binary_Tree();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        assertThat(test.distanceK(root, 5, 2)).isEqualTo(
            Arrays.asList(7, 4, 1)
        );

        root = new TreeNode(1);
        assertThat(test.distanceK(root, 1, 3)).isEqualTo(
            Arrays.asList()
        );
    }
}
