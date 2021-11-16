package leetcode;

public class LC0203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode pointer = head;
        while(pointer != null) {
            // ListNode prev = head;
            if (pointer.val == val) {
                if (prev == null) {
                    head = pointer.next;
                    pointer = head;
                    continue;
                }
                prev.next = pointer.next;
                pointer = pointer.next;
                continue;
            }
            
            prev = pointer;
            pointer = pointer.next;
        }
        return head;
    }
}
