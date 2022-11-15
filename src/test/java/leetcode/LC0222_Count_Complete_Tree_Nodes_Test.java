package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class LC0222_Count_Complete_Tree_Nodes_Test {
    @Test
    void minimumTotal() {
        LC0222_Count_Complete_Tree_Nodes test = new LC0222_Count_Complete_Tree_Nodes();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        assertThat(test.countNodes(root)).isEqualTo(6);

        root = null;
        assertThat(test.countNodes(root)).isEqualTo(0);

        root = new TreeNode(1);
        assertThat(test.countNodes(root)).isEqualTo(1);
    }
}
