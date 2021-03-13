package leetcode;

public class LC0025_ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode t = head;
    	int[] temp = new int[k];
    	
    	while(true) {
    		ListNode partHead = t;
    		boolean isEnd = false;
    		int saveIdx = 0;
    		for (int i = 0 ; i < k ; i++) {
    			temp[k - i - 1] = t.val;
    			t = t.next;
    			if (t == null) {
    				isEnd = true;
    				saveIdx = i;
    				break;
    			}
    			
    		}
    		
    		if (!isEnd || saveIdx == k - 1) {
	    		for (int i = 0 ; i < k ; i++) {
	    			partHead.val = temp[i];
	    			partHead = partHead.next;
	    		}
    		}
    		
    		if (isEnd) break;
    	}
        return head;
    }
	
	public static void main(String[] args) {
		LC0025_ReverseNodesinkGroup t = new LC0025_ReverseNodesinkGroup();
		
		ListNode l1 = new ListNode(1);
		ListNode h1 = l1;
		l1.next = new ListNode(2);		l1 = l1.next;
		l1.next = new ListNode(3);		l1 = l1.next; 
		l1.next = new ListNode(4);		l1 = l1.next;
		l1.next = new ListNode(5);
		
		ListNode ln = t.reverseKGroup(h1, 2);
//		ListNode ln = t.reverseKGroup(h1, 3);
		while(ln != null) {
			System.out.print(ln.val + (ln.next == null ? "" : "->"));
			ln = ln.next;
		}
		System.out.println();
	}
}
