package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2265_Count_Nodes_Equal_to_Average_of_Subtree_Test {
    @Test
    void test() {
        LC2265_Count_Nodes_Equal_to_Average_of_Subtree test = new LC2265_Count_Nodes_Equal_to_Average_of_Subtree();
        
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        
        assertThat(test.averageOfSubtree(root)).isEqualTo(5);
        
        root = new TreeNode(1);
        assertThat(test.averageOfSubtree(root)).isEqualTo(1);
    }
}
