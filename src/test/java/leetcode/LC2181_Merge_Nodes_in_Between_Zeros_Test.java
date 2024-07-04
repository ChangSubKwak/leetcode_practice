package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2181_Merge_Nodes_in_Between_Zeros_Test {

    private LC2181_Merge_Nodes_in_Between_Zeros test = new LC2181_Merge_Nodes_in_Between_Zeros();
    @Test
    void exampleTest1() {
        ListNode listNode = ListNode.setArray(new int[]{0, 3, 1, 0, 4, 5, 2, 0});
        ListNode expected = ListNode.setArray(new int[]{4, 11});

        assertThat(test.mergeNodes(listNode)).isEqualTo(expected);
    }

    @Test
    void exampleTest2() {
        ListNode listNode = ListNode.setArray(new int[]{0, 1, 0, 3, 0, 2, 2, 0});
        ListNode expected = ListNode.setArray(new int[]{1, 3, 4});

        assertThat(test.mergeNodes(listNode)).isEqualTo(expected);
    }
}
