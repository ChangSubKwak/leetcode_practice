package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2929_Distribute_Candies_Among_Children_II_Test {

    @Test
    void test() {
        LC2929_Distribute_Candies_Among_Children_II test = new LC2929_Distribute_Candies_Among_Children_II();

        assertThat(test.distributeCandies(5, 2)).isEqualTo(3);
        assertThat(test.distributeCandies(3, 3)).isEqualTo(10);

    }
}
