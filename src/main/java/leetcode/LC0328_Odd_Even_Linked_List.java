package leetcode;

public class LC0328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        int index = 1;
        ListNode oddHead  = null;
        ListNode evenHead = null;
        ListNode odd  = null;
        ListNode even = null;

        while (head != null) {
            if (index % 2 == 1) {
                if (odd == null) {
                    odd = new ListNode(head.val);
                    oddHead = odd;
                } else {
                    odd.next = new ListNode(head.val);
                    odd = odd.next;
                }
            } else {
                if (even == null) {
                    even = new ListNode(head.val);
                    evenHead = even;
                } else {
                    even.next = new ListNode(head.val);
                    even = even.next;
                }
            }
            index++;
            head = head.next;
        }

        if (odd != null) {
            odd.next = evenHead;
        }
        return oddHead;
    }
}
