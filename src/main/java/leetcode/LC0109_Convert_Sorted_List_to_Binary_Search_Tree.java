package leetcode;

public class LC0109_Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode result = new TreeNode(slow.next.val);
        ListNode rightHalf = slow.next.next;

        slow.next = null;
        result.left  = sortedListToBST(head);
        result.right = sortedListToBST(rightHalf);

        return result;
    }
}
