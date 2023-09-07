package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC0092_Reverse_Linked_List_II_Test {
	@Test
	void test() {
		LC0092_Reverse_Linked_List_II test = new LC0092_Reverse_Linked_List_II();

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode result = new ListNode(1);
		result.next = new ListNode(4);
		result.next.next = new ListNode(3);
		result.next.next.next = new ListNode(2);
		result.next.next.next.next = new ListNode(5);

		assertThat(test.reverseBetween(head, 2, 4)).isEqualTo(result);

		head = new ListNode(5);
		result = new ListNode(5);
		
		assertThat(test.reverseBetween(head, 1, 1)).isEqualTo(result);

	}
}
