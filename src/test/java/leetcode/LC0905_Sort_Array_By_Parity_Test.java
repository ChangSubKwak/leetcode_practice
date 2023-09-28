package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0905_Sort_Array_By_Parity_Test {
    @Test
    void test() {
        LC0905_Sort_Array_By_Parity test = new LC0905_Sort_Array_By_Parity();
        assertThat(test.sortArrayByParity(new int[]{3, 1, 2, 4})).isEqualTo(new int[]{2, 4, 3, 1});
        assertThat(test.sortArrayByParity(new int[]{0})).isEqualTo(new int[]{0});
    }
}
