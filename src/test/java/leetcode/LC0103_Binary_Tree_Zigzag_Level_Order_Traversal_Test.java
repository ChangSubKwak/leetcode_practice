package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class LC0103_Binary_Tree_Zigzag_Level_Order_Traversal_Test {

    @Test
    void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left  = new TreeNode(15);
        root.right.right = new TreeNode(7);
        LC0103_Binary_Tree_Zigzag_Level_Order_Traversal test = new LC0103_Binary_Tree_Zigzag_Level_Order_Traversal();
        assertThat(test.zigzagLevelOrder(root)).isEqualTo(Arrays.asList(
            Arrays.asList(3),
            Arrays.asList(20, 9),
            Arrays.asList(15, 7)
        ));
    }
}