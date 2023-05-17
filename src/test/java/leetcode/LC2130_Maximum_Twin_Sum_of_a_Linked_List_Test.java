package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2130_Maximum_Twin_Sum_of_a_Linked_List_Test {
    @Test
    void exampleTest() {
        LC2130_Maximum_Twin_Sum_of_a_Linked_List test = new LC2130_Maximum_Twin_Sum_of_a_Linked_List();
        ListNode start = new ListNode(5);
        start.next = new ListNode(4);
        start.next.next = new ListNode(2);
        start.next.next.next = new ListNode(1);
        assertThat(test.pairSum(start)).isEqualTo(6);

        start = new ListNode(4);
        start.next = new ListNode(2);
        start.next.next = new ListNode(2);
        start.next.next.next = new ListNode(3);
        assertThat(test.pairSum(start)).isEqualTo(7);

        start = new ListNode(1);
        start.next = new ListNode(100000);
        assertThat(test.pairSum(start)).isEqualTo(100001);
    }
}
