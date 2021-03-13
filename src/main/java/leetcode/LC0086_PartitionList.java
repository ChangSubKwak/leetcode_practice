package leetcode;

public class LC0086_PartitionList {
    public ListNode partition(ListNode head, int x) {
    	if (head == null || head.next == null) return head;
    	
    	ListNode dummy = new ListNode(0);
        ListNode prevS = null;
        ListNode currS = null;
        ListNode prevI = null;
        ListNode currI = null;
        
        dummy.next = head;
        
        ListNode t = dummy;
        while(t.next != null && x > (int)( t.next.val))
        	t = t.next;
        prevS = t;
        currS = t.next;
        
        while(t.next != null) {
        	t= currS;
        	
        	while(t.next != null && x <= (int) t.next.val) 
        		t = t.next;
        	prevI = t;
        	currI = t.next;
        	
        	if (prevI == null || currI == null) return dummy.next;
        	
        	// 노드 끊기
        	prevI.next = currI.next;
        	
        	// 노드 연결
        	currI.next = currS;
        	prevS.next = currI;
        	prevS = prevS.next;
        	
        	System.out.print("debug : ");
        	ListNode.print(dummy.next);
        }
        
    	return dummy.next;
    }
	
	public static void main(String[] args) {
		LC0086_PartitionList t = new LC0086_PartitionList();
//		ListNode l = ListNode.setArray(new int[] {1,4,3,2,5,2});
//		ListNode l = ListNode.setArray(new int[] {1,1});
//		ListNode l = ListNode.setArray(new int[] {3,1});
//		ListNode l = ListNode.setArray(new int[] {1,4,3,2,5,2});
		ListNode l = ListNode.setArray(new int[] {2,1,3});
		ListNode.print(l);
//		l = t.partition(l, 3);
//		l = t.partition(l, 0);
//		l = t.partition(l, 2);
//		l = t.partition(l, 3);
		l = t.partition(l, 2);
		ListNode.print(l);
	}
}
