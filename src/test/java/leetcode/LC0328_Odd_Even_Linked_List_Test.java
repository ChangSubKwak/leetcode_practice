package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0328_Odd_Even_Linked_List_Test {
    @Test
    void test() {
        LC0328_Odd_Even_Linked_List test = new LC0328_Odd_Even_Linked_List();
        ListNode input = ListNode.setArray(new int[]{1, 2, 3, 4, 5});
        ListNode result = test.oddEvenList(input);
        ListNode expected = ListNode.setArray(new int[]{1, 3, 5, 2, 4});

        while(result != null) {
            assertThat(result.val).isEqualTo(expected.val);
            result = result.next;
            expected = expected.next;
        }
    }
}
