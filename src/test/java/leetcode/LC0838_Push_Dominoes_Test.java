package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0838_Push_Dominoes_Test {
    
    @Test
    void test() {
        LC0838_Push_Dominoes test = new LC0838_Push_Dominoes();

        assertThat(test.pushDominoes("RR.L")).isEqualTo("RR.L");
        assertThat(test.pushDominoes(".L.R...LR..L..")).isEqualTo("LL.RR.LLRRLL..");
    }
}
