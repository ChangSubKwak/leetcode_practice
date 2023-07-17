package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0445_Add_Two_Numbers_II_Test {

    @Test
    void minimumTotal() {
        LC0445_Add_Two_Numbers_II test = new LC0445_Add_Two_Numbers_II();

        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new ListNode(7);
        result.next = new ListNode(8);
        result.next.next = new ListNode(0);
        result.next.next.next = new ListNode(7);

        assertThat(test.addTwoNumbers(l1, l2)).isEqualTo(result);

        l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        result = new ListNode(8);
        result.next = new ListNode(0);
        result.next.next = new ListNode(7);

        assertThat(test.addTwoNumbers(l1, l2)).isEqualTo(result);

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        result = new ListNode(0);

        assertThat(test.addTwoNumbers(l1, l2)).isEqualTo(result);
    }
}
