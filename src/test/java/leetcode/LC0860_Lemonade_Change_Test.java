package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0860_Lemonade_Change_Test {
    LC0860_Lemonade_Change test;
    
    @BeforeEach
    void setUp() {
        test = new LC0860_Lemonade_Change();
    }
    
    @Test
    void test() {
        assertThat(test.lemonadeChange(new int[]{5, 5, 5, 10, 20})).isTrue();
        assertThat(test.lemonadeChange(new int[]{5, 5, 10, 10, 20})).isFalse();
        assertThat(test.lemonadeChange(new int[]{5, 5, 5, 5, 5, 5, 10, 10, 20, 20})).isTrue();
        assertThat(test.lemonadeChange(new int[]{5, 5, 5, 5, 5, 10, 10, 10, 10, 20})).isTrue();
        assertThat(test.lemonadeChange(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 10, 20, 20, 20})).isTrue();
    }
}
