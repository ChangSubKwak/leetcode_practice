package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1028_Recover_a_Tree_From_Preorder_Traversal_Test {

    @Test
    void test1() {
        LC1028_Recover_a_Tree_From_Preorder_Traversal test = new LC1028_Recover_a_Tree_From_Preorder_Traversal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        assertThat(test.recoverFromPreorder("1-2--3--4-5--6--7")).isEqualTo(root);
    }

    @Test
    void test2() {
        LC1028_Recover_a_Tree_From_Preorder_Traversal test = new LC1028_Recover_a_Tree_From_Preorder_Traversal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        assertThat(test.recoverFromPreorder("1-2--3---4-5--6---7")).isEqualTo(root);
    }

    @Test
    void test3() {
        LC1028_Recover_a_Tree_From_Preorder_Traversal test = new LC1028_Recover_a_Tree_From_Preorder_Traversal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(401);

        root.left.left = new TreeNode(349);
        root.left.right = new TreeNode(88);
        root.left.left.left = new TreeNode(90);


        assertThat(test.recoverFromPreorder("1-401--349---90--88")).isEqualTo(root);
    }

}
