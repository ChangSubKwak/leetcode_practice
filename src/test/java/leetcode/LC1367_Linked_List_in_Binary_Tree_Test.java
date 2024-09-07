package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LC1367_Linked_List_in_Binary_Tree_Test {

    @Test
    void test1() {
        LC1367_Linked_List_in_Binary_Tree test = new LC1367_Linked_List_in_Binary_Tree();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left = new TreeNode(1);

        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(3);

        assertThat(test.isSubPath(head, root)).isEqualTo(true);
    }

    @Test
    void test2() {
        LC1367_Linked_List_in_Binary_Tree test = new LC1367_Linked_List_in_Binary_Tree();

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(3);

        assertThat(test.isSubPath(head, root)).isEqualTo(true);
    }

    @Test
    void test3() {
        LC1367_Linked_List_in_Binary_Tree test = new LC1367_Linked_List_in_Binary_Tree();

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(3);

        assertThat(test.isSubPath(head, root)).isEqualTo(false);
    }
}
