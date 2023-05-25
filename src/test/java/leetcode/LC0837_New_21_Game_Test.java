package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0837_New_21_Game_Test {
    
    @Test
    void test() {
        LC0837_New_21_Game test = new LC0837_New_21_Game();

        assertThat(test.new21Game(10, 1, 10)).isEqualTo(1.00000);
        assertThat(test.new21Game(6, 1, 10)).isEqualTo(0.60000);
        assertThat(test.new21Game(21, 17, 10)).isEqualTo(0.73278);
    }
}
