package leetcode;

public class LC0082_Remove_Duplicates_from_Sorted_List_II {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode p = dummy;
		ListNode c = head;
		while(c != null) {
			while(c.next != null && c.val == c.next.val) c = c.next;
			if (p.next == c) p = c;
			else             p.next = c.next;
			c = c.next;
		}
		return dummy.next;
	}
	
    public ListNode deleteDuplicates_20220309(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode start = new ListNode();
        ListNode prev  = new ListNode();
        ListNode prev2 = new ListNode();
        ListNode curr  = new ListNode();
        
        prev2 = new ListNode();
        prev  = head;
        curr  = head.next;
        
        prev2.next = head;
        start.next = head;
        while(curr != null) {
            // work
            boolean isEqual = false;
            while(curr != null && prev.val == curr.val) {
                isEqual = true;
                prev = curr;
                curr = curr.next;
            }
            
            if (isEqual) {
                if (prev2.next == head) {
                    head = curr;
                    start.next = curr;
                }
                prev2.next = curr;
                prev = curr;
                
                if (curr != null) {
                    curr = curr.next;
                }
                continue;
            }
            
            prev2 = prev;
            prev = curr;
            curr = curr.next;
        }
        return start.next;
    }
}
