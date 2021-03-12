package main.java.leetcode;

public class LC0023_MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
    	ListNode res = new ListNode();
    	ListNode head = new ListNode();
    	head = res;
    	
    	if (lists.length == 0) return null;
    	int count = 0;
    	for (int i = 0 ; i < lists.length ; i++) {
    		count += (lists[i] != null ? 1 : 0);
    	}
    	
    	if (count == 0)
    		return null;
    	
    	
    	while(true) {
    		boolean isCompleted = true;
    		for (int i = 0 ; i < lists.length ; i++) {
    			if (lists[i] != null) {
    				isCompleted = false;
    				break;
    			}
    		}
    		if (isCompleted) break;
    		
    		int minIdx = 0;
    		while(lists[minIdx] == null)
    			minIdx++;
    		
    		for (int i = 0 ; i < lists.length ; i++) {
    			if (lists[i] == null) continue;
    			
    			if (lists[minIdx].val > lists[i].val) {
    				minIdx = i;
    			}
    		}
			res.next = new ListNode(lists[minIdx].val);
			lists[minIdx] = lists[minIdx].next;
			res = res.next;
    	}
    	
        return head.next;
    }
	
	public static void main(String[] args) {
		LC0023_MergekSortedLists t = new LC0023_MergekSortedLists();
		
		/*
		ListNode l1 = new ListNode(1);
		ListNode h1 = l1;
		l1.next = new ListNode(4);		l1 = l1.next;
		l1.next = new ListNode(5);		l1 = l1.next; 
		
		ListNode l2 = new ListNode(1);
		ListNode h2 = l2;
		l2.next = new ListNode(3);	l2 = l2.next;
		l2.next = new ListNode(4);  l2 = l2.next;
		
		ListNode l3 = new ListNode(2);
		ListNode h3 = l3;
		l3.next = new ListNode(6);	l3 = l3.next;
		
		ListNode[] lists = new ListNode[3];
		lists[0] = h1;		lists[1] = h2;		lists[2] = h3;
		
		ListNode ln = t.mergeKLists(lists);
		//*/

		ListNode h1 = null;
		ListNode h2 = new ListNode(1);
		
		ListNode[] test = new ListNode[2];
		test[0] = h1;
		test[1] = h2;
		ListNode ln = t.mergeKLists(test);
		while(ln != null) {
			System.out.print(ln.val + (ln.next == null ? "" : "->"));
			ln = ln.next;
		}
		System.out.println();
	}
}
