package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0904_Fruit_Into_Baskets_Test {
    @Test
    void test() {
        LC0904_Fruit_Into_Baskets test = new LC0904_Fruit_Into_Baskets();

        assertThat(test.totalFruit(new int[]{1, 2, 1})).isEqualTo(3);
        assertThat(test.totalFruit(new int[]{0, 1, 2, 2})).isEqualTo(3);
        assertThat(test.totalFruit(new int[]{1, 2, 3, 2, 2})).isEqualTo(4);
    }
}
