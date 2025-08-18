package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0679_24_Game_Test {
    
    @Test
    void test() {
        LC0679_24_Game test = new LC0679_24_Game();
        
        assertThat(test.judgePoint24(new int[]{4, 1, 8, 7})).isEqualTo(true);
        assertThat(test.judgePoint24(new int[]{1, 2, 1, 2})).isEqualTo(false);
    }
}
