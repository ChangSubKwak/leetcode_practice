package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2127_Maximum_Employees_to_Be_Invitied_to_a_Meeting_Test {
    @Test
    void exampleTest() {
        LC2127_Maximum_Employees_to_Be_Invitied_to_a_Meeting test = new LC2127_Maximum_Employees_to_Be_Invitied_to_a_Meeting();

        assertThat(test.maximumInvitations(new int[]{2, 2, 1, 2})).isEqualTo(3);
        assertThat(test.maximumInvitations(new int[]{1, 2, 0})).isEqualTo(3);
        assertThat(test.maximumInvitations(new int[]{3, 0, 1, 4, 1})).isEqualTo(4);
    }
}
