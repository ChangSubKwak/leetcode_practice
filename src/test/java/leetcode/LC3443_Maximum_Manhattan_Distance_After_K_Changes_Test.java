package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3443_Maximum_Manhattan_Distance_After_K_Changes_Test {
    @Test
    void test() {
        LC3443_Maximum_Manhattan_Distance_After_K_Changes test = new LC3443_Maximum_Manhattan_Distance_After_K_Changes();

        assertThat(test.maxDistance("NWSE", 1)).isEqualTo(3);
        assertThat(test.maxDistance("NSWWEW", 3)).isEqualTo(6);
    }
}
