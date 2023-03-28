package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class LC0983_Minimum_Cost_For_Tickets_Test {
    @Test
    void test() {
        LC0983_Minimum_Cost_For_Tickets test = new LC0983_Minimum_Cost_For_Tickets();
        assertThat(test.mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15})).isEqualTo(11);
        assertThat(test.mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15})).isEqualTo(17);
    }
}
