package leetcode;

public class LC0160_Intersection_of_Two_Linked_Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode t1 = headA;
		ListNode t2 = headB;

		while(t1 != null) {
			t2 = headB;
			while(t2 != null) {
				if (t1 == t2) {
					return t1;
				}
				t2 = t2.next;
			}
			t1 = t1.next;
		}
		return null;
	}
}
