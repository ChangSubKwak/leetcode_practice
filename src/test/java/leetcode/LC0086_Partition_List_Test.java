package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class LC0086_Partition_List_Test {
    @Test
    void test() {
        LC0086_Partition_List test = new LC0086_Partition_List();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        
        ListNode result = new ListNode(1);
        result.next = new ListNode(2);
        result.next.next = new ListNode(2);
        result.next.next.next = new ListNode(4);
        result.next.next.next.next = new ListNode(3);
        result.next.next.next.next.next = new ListNode(5);
        
        assertThat(Arrays.stream(test.partition(head, 3).getArray()).boxed().collect(Collectors.toList())).isEqualTo(
            Arrays.stream(result.getArray()).boxed().collect(Collectors.toList())
        );
    }
}
