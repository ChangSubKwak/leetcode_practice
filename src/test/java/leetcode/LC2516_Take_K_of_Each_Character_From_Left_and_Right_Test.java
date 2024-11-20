package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2516_Take_K_of_Each_Character_From_Left_and_Right_Test {
    @Test
    void test() {
        LC2516_Take_K_of_Each_Character_From_Left_and_Right test = new LC2516_Take_K_of_Each_Character_From_Left_and_Right();

        assertThat(test.takeCharacters("aabaaaacaabc", 2)).isEqualTo(8);
        assertThat(test.takeCharacters("a", 1)).isEqualTo(-1);
    }
}
