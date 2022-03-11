package leetcode;

public class LC0061_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
    	if (head == null || head.next == null) return head;
        
    	int len = 1;
    	ListNode mid = head;
    	while(mid.next != null) { len++; mid = mid.next; }
    	
    	ListNode end = head;
    	for (int i = 1 ; i < len - k % len ; i++) {
    		end = end.next;
    	}
    	
    	mid.next = head;
    	head = end.next;
    	end.next = null;
    	
    	while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
    	
    	return head;
    }
	
	public static void main(String[] args) {
		LC0061_Rotate_List t = new LC0061_Rotate_List();
		ListNode head = new ListNode(1);
//		ListNode head = new ListNode(0);
		ListNode l = head;
		
//		for (int i = 1 ; i <= 2 ; i++) {
//			l.next = new ListNode(i);
//			l = l.next;
//		}
		
		for (int i = 2 ; i <= 5 ; i++) {
			l.next = new ListNode(i);
			l = l.next;
		}
		
//		l = head;
//		while(l != null) {
//			System.out.println(l.val);
//			l = l.next;
//		}
		
		System.out.println(t.rotateRight(head, 2));
	}
}
