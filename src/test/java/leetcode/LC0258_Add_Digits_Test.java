package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0258_Add_Digits_Test {

    
    @Test
    void test() {
        LC0258_Add_Digits test = new LC0258_Add_Digits();
        assertThat(test.addDigits(38)).isEqualTo(2);
        assertThat(test.addDigits(0)).isEqualTo(0);
    }
}
