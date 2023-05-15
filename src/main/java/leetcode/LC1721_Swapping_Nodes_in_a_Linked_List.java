package leetcode;

public class LC1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode start = new ListNode();
        start.next = head;

        ListNode first;
        ListNode fast = start;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        first = fast;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        int val = first.val;
        first.val = slow.val;
        slow.val = val;

        return start.next;
    }
}
