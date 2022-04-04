package leetcode;

public class LC1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t1 = head;
        int size = 0;
        while(t1 != null) {
            t1 = t1.next;
            size++;
        }
        System.out.println("size : " + size);
        
        int k2 = size - k;
        
        t1 = head;
        ListNode t2 = head;
        
        for (int i = 0; i < k - 1; i++) {
            t1 = t1.next;
        }
        
        for (int i = 0; i < k2; i++) {
            t2 = t2.next;
        }
        return null;
    }
}
