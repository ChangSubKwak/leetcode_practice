                                package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0234_Palindrome_Linked_Link_Test {
    LC0234_Palindrome_Linked_Link test;
    ListNode testNode;

    @BeforeEach
    void setUp() {
        test = new LC0234_Palindrome_Linked_Link();
    }
    
    @Test
    void minimumTotal() {
        testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next = new ListNode(2);
        testNode.next = new ListNode(1);
        assertThat(test.isPalindrome(testNode)).isTrue();
    }
}
