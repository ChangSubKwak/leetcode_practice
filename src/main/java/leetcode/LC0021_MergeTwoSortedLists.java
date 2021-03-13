package leetcode;

public class LC0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode();
    	ListNode head = new ListNode();
    	head = res;
    	
    	//res.next = new ListNode();
    	//res = res.next;
    	
    	while(l1 != null && l2 != null) {
    		if (l1.val <= l2.val) {
    			res.next = new ListNode(l1.val);
    			l1 = l1.next;
    		}
    		else {
    			res.next = new ListNode(l2.val);
    			l2 = l2.next;
    		}
    		res = res.next;
    	}
    	
    	while(l1 != null) {
			res.next = new ListNode(l1.val);
    		l1 = l1.next;
    		res = res.next;
    	}
    	
    	while(l2 != null) {
			res.next = new ListNode(l2.val);
    		l2 = l2.next;
    		res = res.next;
    	}
    	
    	return head.next;
    }
	
	public static void main(String[] args) {
		LC0021_MergeTwoSortedLists t = new LC0021_MergeTwoSortedLists();
		
		
		ListNode l1 = new ListNode(1);
		ListNode h1 = l1;
		l1.next = new ListNode(2);		l1 = l1.next;
		l1.next = new ListNode(4);		l1 = l1.next; 
		
		ListNode l2 = new ListNode(1);
		ListNode h2 = l2;
		l2.next = new ListNode(3);	l2 = l2.next;
		l2.next = new ListNode(4);  l2 = l2.next; 
		
		ListNode ln = t.mergeTwoLists(h1, h2);
		while(ln != null) {
			System.out.print(ln.val + (ln.next == null ? "" : "->"));
			ln = ln.next;
		}
		System.out.println();

	}
}
