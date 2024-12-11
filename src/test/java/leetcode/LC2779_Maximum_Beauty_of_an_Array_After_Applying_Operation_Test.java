package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC2779_Maximum_Beauty_of_an_Array_After_Applying_Operation_Test {
    @Test
    void test() {
        LC2779_Maximum_Beauty_of_an_Array_After_Applying_Operation test = new LC2779_Maximum_Beauty_of_an_Array_After_Applying_Operation();

        assertThat(test.maximumBeauty(new int[]{4, 6, 1, 2}, 2)).isEqualTo(3);
        assertThat(test.maximumBeauty(new int[]{1, 1, 1, 1}, 10)).isEqualTo(4);
    }
}
