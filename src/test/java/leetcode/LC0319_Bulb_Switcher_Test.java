package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0319_Bulb_Switcher_Test {
    @Test
    void minimumTotal() {
        LC0319_Bulb_Switcher test = new LC0319_Bulb_Switcher();
        assertThat(test.bulbSwitch(3)).isEqualTo(1);
        assertThat(test.bulbSwitch(0)).isEqualTo(0);
        assertThat(test.bulbSwitch(1)).isEqualTo(1);
    }
}
