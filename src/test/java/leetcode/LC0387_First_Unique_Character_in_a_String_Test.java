package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0387_First_Unique_Character_in_a_String_Test {
    LC0387_First_Unique_Character_in_a_String test;

    @BeforeEach
    void setUp() {
        test = new LC0387_First_Unique_Character_in_a_String();
    }

    @Test
    void test() {
        assertThat(test.firstUniqChar("leetcode")).isEqualTo(0);
        assertThat(test.firstUniqChar("loveleetcode")).isEqualTo(2);
        assertThat(test.firstUniqChar("aabb")).isEqualTo(-1);
    }
}
