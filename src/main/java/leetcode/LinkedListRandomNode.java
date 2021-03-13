package leetcode;

public class LinkedListRandomNode {
	int size;
	ListNode head;
	public LinkedListRandomNode(ListNode head) {
		this.head = head;
		size = 1;
		while(head.next!=null) {
			head = head.next;
			size++;
		}
		//System.out.println(size);
	}

	public int getRandom() {
		int randomNum = (int)(Math.random() * size);
		
		ListNode t = this.head;
		for (int i = 0 ; i < randomNum ; i++) {
			//System.out.println("t.val : " + t.val);
			t = t.next;
		}
		//System.out.println("randomNum : " + randomNum);
		
		return t.val;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		LinkedListRandomNode t = new LinkedListRandomNode(head);
		System.out.println(t.getRandom());
	}

}
