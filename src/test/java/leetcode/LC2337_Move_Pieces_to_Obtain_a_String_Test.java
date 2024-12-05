package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2337_Move_Pieces_to_Obtain_a_String_Test {

    @Test
    void exampleTest() {
        LC2337_Move_Pieces_to_Obtain_a_String test = new LC2337_Move_Pieces_to_Obtain_a_String();

        assertThat(test.canChange("_L__R__R_", "L______RR")).isEqualTo(true);
        assertThat(test.canChange("R_L_", "__LR")).isEqualTo(false);
        assertThat(test.canChange("_R", "R_")).isEqualTo(false);
    }
}
