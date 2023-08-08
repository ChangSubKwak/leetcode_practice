package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0033_Search_in_Rotated_Sorted_Array_Test {

    @Test
    void test() {
        LC0033_Search_in_Rotated_Sorted_Array test = new LC0033_Search_in_Rotated_Sorted_Array();

        assertThat(test.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
        assertThat(test.search(new int[]{4, 5, 6, 7, 0, 1, 2}, -1)).isEqualTo(-1);
        assertThat(test.search(new int[]{1}, 0)).isEqualTo(-1);
    }
}