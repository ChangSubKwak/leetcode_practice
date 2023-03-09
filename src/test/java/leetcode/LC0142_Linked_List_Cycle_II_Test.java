package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0142_Linked_List_Cycle_II_Test {
    @Test
    void test() {
        LC0142_Linked_List_Cycle_II test = new LC0142_Linked_List_Cycle_II();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertThat(test.detectCycle(head)).isEqualTo(head.next);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertThat(test.detectCycle(head)).isEqualTo(head);

        head = new ListNode(1);
        assertThat(test.detectCycle(head)).isEqualTo(null);
    }
}
