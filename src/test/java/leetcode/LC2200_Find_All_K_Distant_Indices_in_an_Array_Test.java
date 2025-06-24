package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class LC2200_Find_All_K_Distant_Indices_in_an_Array_Test {
    @Test
    void test() {
        LC2200_Find_All_K_Distant_Indices_in_an_Array test = new LC2200_Find_All_K_Distant_Indices_in_an_Array();

        assertThat(test.findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1)).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
        assertThat(test.findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2)).isEqualTo(new int[]{0, 1, 2, 3, 4});
    }
}
