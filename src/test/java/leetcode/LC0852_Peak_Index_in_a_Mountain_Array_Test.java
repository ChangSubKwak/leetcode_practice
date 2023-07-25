package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LC0852_Peak_Index_in_a_Mountain_Array_Test {
    
    @Test
    void test() {
        LC0852_Peak_Index_in_a_Mountain_Array test = new LC0852_Peak_Index_in_a_Mountain_Array();

        assertThat(test.peakIndexInMountainArray(new int[]{0, 1, 0})).isEqualTo(1);
        assertThat(test.peakIndexInMountainArray(new int[]{0, 2, 1, 0})).isEqualTo(1);
        assertThat(test.peakIndexInMountainArray(new int[]{0, 10, 5, 2})).isEqualTo(1);
    }
}
