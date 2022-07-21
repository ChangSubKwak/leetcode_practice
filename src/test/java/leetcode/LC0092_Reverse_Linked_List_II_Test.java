package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0092_Reverse_Linked_List_II_Test {
	LC0092_Reverse_Linked_List_II test;
	ListNode input;
	ListNode result;
	
	@BeforeEach
	void setUp() {
		test = new LC0092_Reverse_Linked_List_II();
		ListNode inputOne = new ListNode(1);
		ListNode inputTwo = new ListNode(2);
		ListNode inputThree = new ListNode(3);
		ListNode inputFour = new ListNode(4);
		ListNode inputFive = new ListNode(5);
		inputOne.next = inputTwo;
		inputTwo.next = inputThree;
		inputThree.next = inputFour;
		inputFour.next = inputFive;

		input = inputOne;

		ListNode resultOne = new ListNode(1);
		ListNode resultTwo = new ListNode(2);
		ListNode resultThree = new ListNode(3);
		ListNode resultFour = new ListNode(4);
		ListNode resultFive = new ListNode(5);
		resultOne.next = resultFour;
		resultFour.next = resultThree;
		resultThree.next = resultTwo;
		resultTwo.next = resultFive;

		result = resultOne;
	}
	
	@Test
	void test() {
		assertThat(test.reverseBetween(input, 2, 4)).isEqualTo(result);
	}
}
