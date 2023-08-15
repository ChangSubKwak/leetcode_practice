package leetcode;

public class LC0086_Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode();
        ListNode greater = new ListNode();
        
        ListNode t1 = head;
        ListNode t2 = less;
        ListNode t3 = greater;
        while(t1 != null) {
            if (t1.val < x) {
                t2.next = t1;
                t2 = t2.next;
            } else {
                t3.next = t1;
                t3 = t3.next;
            }
            t1 = t1.next;
        }
        t2.next = greater.next;
        t3.next = null;
        
        return less.next;
    }
}
