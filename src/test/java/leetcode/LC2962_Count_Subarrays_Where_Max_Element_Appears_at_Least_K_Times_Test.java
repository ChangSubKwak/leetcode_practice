package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times_Test {

    @Test
    void test() {
        LC2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times test = new LC2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times();

        assertThat(test.countSubarrays(new int[]{1, 3, 2, 3, 3}, 2)).isEqualTo(6);
        assertThat(test.countSubarrays(new int[]{1, 4, 2, 1}, 3)).isEqualTo(0);
    }
}
