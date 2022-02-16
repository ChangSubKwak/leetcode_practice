package leetcode;

public class LC0024_Swap_Nodes_in_Pairs {
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
