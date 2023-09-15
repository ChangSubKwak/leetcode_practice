package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0135_Candy_Test {

    @Test
    void test() {
        LC0135_Candy test = new LC0135_Candy();
        assertThat(test.candy(new int[]{1, 0, 2})).isEqualTo(5);
        assertThat(test.candy(new int[]{1, 2, 2})).isEqualTo(4);
    }
}