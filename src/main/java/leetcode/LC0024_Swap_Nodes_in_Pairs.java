package leetcode;

public class LC0024_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        int count = 0;
        ListNode p = new ListNode();
        p.next = head;
        
        ListNode t1 = new ListNode();
        ListNode t2 = new ListNode();
        ListNode t0 = new ListNode();
        
        while(p.next != null) {
            t1 = p;
            p = p.next;
            t2 = p;
            count++;
            if (count % 2 == 1) {
                t0 = t1;
                continue;
            }
            
            if (count == 2) {
                t1.next = t2.next;
                t2.next = t1;
                head = t2;
                p = t1;
                continue;
            }
            
            t1.next = t2.next;
            t0.next = t2;
            t2.next = t1;
            p = t1;
        }
        
        return head;
    }
    
	/*
	public ListNode swapPairs(ListNode head) {
    	ListNode t = head;
    	
    	while(t != null) {
    		int f = t.val;
    		int s;
    		if (t.next != null) {
    			s = t.next.val;
    			
    			t.val = s;
    			t.next.val = f;
    			t = t.next;
    		}
    		t = t.next;
    	}
    	
        return head;
    }
    */
	
	public static void main(String[] args) {
		LC0024_Swap_Nodes_in_Pairs t = new LC0024_Swap_Nodes_in_Pairs();
		
		ListNode l1 = new ListNode(1);
		ListNode h1 = l1;
		l1.next = new ListNode(2);		l1 = l1.next;
		l1.next = new ListNode(3);		l1 = l1.next; 
		l1.next = new ListNode(4);		l1 = l1.next;
		
		ListNode ln = t.swapPairs(h1);
		while(ln != null) {
			System.out.print(ln.val + (ln.next == null ? "" : "->"));
			ln = ln.next;
		}
		System.out.println();
	}
}
