package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2873_Maximum_Value_of_an_Ordered_Triplet_II_Test {
    @Test
    void test() {
        LC2873_Maximum_Value_of_an_Ordered_Triplet_II test = new LC2873_Maximum_Value_of_an_Ordered_Triplet_II();

        assertThat(test.maximumTripletValue(new int[]{12, 6, 1, 2, 7})).isEqualTo(77);
        assertThat(test.maximumTripletValue(new int[]{1, 10, 3, 4, 19})).isEqualTo(133);
        assertThat(test.maximumTripletValue(new int[]{1, 2, 3})).isEqualTo(0);

    }
}
