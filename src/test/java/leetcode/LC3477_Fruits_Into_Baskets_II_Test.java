package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3477_Fruits_Into_Baskets_II_Test {
    @Test
    void test() {
        LC3477_Fruits_Into_Baskets_II test = new LC3477_Fruits_Into_Baskets_II();

        assertThat(test.numOfUnplacedFruits(new int[]{4, 2, 5}, new int[]{3, 5, 4})).isEqualTo(1);
        assertThat(test.numOfUnplacedFruits(new int[]{3, 6, 1}, new int[]{6, 4, 7})).isEqualTo(0);
    }
}
