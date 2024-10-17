package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0670_Maximum_Swap_Test {
    
    @Test
    void test() {
        LC0670_Maximum_Swap test = new LC0670_Maximum_Swap();
        
        assertThat(test.maximumSwap(2736)).isEqualTo(7236);
        assertThat(test.maximumSwap(9973)).isEqualTo(9973);
    }
}
