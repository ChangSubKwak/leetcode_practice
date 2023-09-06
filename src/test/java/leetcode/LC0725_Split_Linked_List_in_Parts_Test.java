package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import leetcode.LC0729_My_Calendar_I.MyCalendar;

public class LC0725_Split_Linked_List_in_Parts_Test {
	@Test
	void test() {
		LC0725_Split_Linked_List_in_Parts test = new LC0725_Split_Linked_List_in_Parts();

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode();
		head.next.next.next.next = new ListNode();

		int k = 5;

		ListNode[] result = new ListNode[k];
		result[0] = new ListNode(1);
		result[1] = new ListNode(2);
		result[2] = new ListNode(3);
		result[3] = new ListNode();
		result[4] = new ListNode();

		assertThat(test.splitListToParts(head, 5)).isEqualTo(result);

		head = new ListNode();
		ListNode temp = head;
		for (int i = 1; i <= 10; i++) {
			temp = new ListNode(i);
			temp = temp.next;
		}

		k = 3;
		result = new ListNode[k];
		temp = result[0];
		for (int i = 1; i <= 4; i++) {
			temp = new ListNode(i);
			temp = temp.next;
		}

		temp = result[1];
		for (int i = 5; i <= 7; i++) {
			temp = new ListNode(i);
			temp = temp.next;
		}

		temp = result[2];
		for (int i = 8; i <= 10; i++) {
			temp = new ListNode(i);
			temp = temp.next;
		}

		assertThat(test.splitListToParts(head, 3)).isEqualTo(result);
	}
}
