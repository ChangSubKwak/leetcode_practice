package leetcode;

public class LC1721_Swapping_Nodes_in_a_Linked_List_X {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first;
        ListNode fast = dummy;
        ListNode slow = head;
        
        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        first = fast;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        
        return dummy.next;
    }
}
