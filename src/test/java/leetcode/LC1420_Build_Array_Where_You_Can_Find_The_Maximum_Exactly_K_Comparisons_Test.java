package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1420_Build_Array_Where_You_Can_Find_The_Maximum_Exactly_K_Comparisons_Test {
    @Test
    void test() {
        LC1420_Build_Array_Where_You_Can_Find_The_Maximum_Exactly_K_Comparisons test = new LC1420_Build_Array_Where_You_Can_Find_The_Maximum_Exactly_K_Comparisons();
        assertThat(test.numOfArrays(2, 3, 1)).isEqualTo(6);
        assertThat(test.numOfArrays(5, 2, 3)).isEqualTo(0);
        assertThat(test.numOfArrays(9, 1, 1)).isEqualTo(1);
    }
}
