package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1721_Swapping_Nodes_in_a_Linked_List_Test {
    LC1721_Swapping_Nodes_in_a_Linked_List test = new LC1721_Swapping_Nodes_in_a_Linked_List();

    @Test
    void exampleTest() {
        ListNode head            = new ListNode(1);
        head.next                = new ListNode(2);
        head.next.next           = new ListNode(3);
        head.next.next.next      = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result            = new ListNode(1);
        result.next                = new ListNode(4);
        result.next.next           = new ListNode(3);
        result.next.next.next      = new ListNode(2);
        result.next.next.next.next = new ListNode(5);

        assertThat(test.swapNodes(head, 2).getArray()).isEqualTo(result.getArray());

    }
}
