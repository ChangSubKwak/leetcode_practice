package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1601_Maximum_Number_of_Achievable_Transfer_Requests_Test {
    @Test
    void test() {
        LC1601_Maximum_Number_of_Achievable_Transfer_Requests test = new LC1601_Maximum_Number_of_Achievable_Transfer_Requests();
        assertThat(test.maximumRequests(5, new int[][]{
            {0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}
        })).isEqualTo(5);

        assertThat(test.maximumRequests(3, new int[][]{
            {0, 0}, {1, 2}, {2, 1}
        })).isEqualTo(3);

        assertThat(test.maximumRequests(4, new int[][]{
            {0, 3}, {3, 1}, {1, 2}, {2, 0}
        })).isEqualTo(4);
    }
}
