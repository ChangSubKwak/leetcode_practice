package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer_Test {
    
    @Test
    void test() {
        LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer test = new LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer();

        ListNode root = new ListNode(1);
        root.next = new ListNode(0);
        root.next.next = new ListNode(1);

        assertThat(test.getDecimalValue(root)).isEqualTo(5);

        root = new ListNode(0);
        assertThat(test.getDecimalValue(root)).isEqualTo(0);
    }
}
