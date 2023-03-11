package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0109_Convert_Sorted_List_to_Binary_Search_Tree_Test {

    @Test
    void test() {
        LC0109_Convert_Sorted_List_to_Binary_Search_Tree test = new LC0109_Convert_Sorted_List_to_Binary_Search_Tree();

        ListNode node = new ListNode(-10);
        node.next = new ListNode(-3);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(9);

        TreeNode result = new TreeNode(0);
        result.left = new TreeNode(-3);
        result.right = new TreeNode(9);
        result.left.left = new TreeNode(-10);
        result.right.left = new TreeNode(5);

        assertThat(test.sortedListToBST(node)).isEqualTo(result);
    }
}