package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0881_Boats_to_Save_People_Test {
    @Test
    void test() {
        LC0881_Boats_to_Save_People test = new LC0881_Boats_to_Save_People();
        assertThat(test.numRescueBoats(new int[]{1, 2}, 3)).isEqualTo(1);
        assertThat(test.numRescueBoats(new int[]{3, 2, 2, 1}, 3)).isEqualTo(3);
        assertThat(test.numRescueBoats(new int[]{3, 5, 3, 4}, 5)).isEqualTo(4);
    }
}
