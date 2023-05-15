package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC2466_Count_Ways_To_Build_Good_Strings_Test {

    @Test
    void test() {
        LC2466_Count_Ways_To_Build_Good_Strings test = new LC2466_Count_Ways_To_Build_Good_Strings();
        assertThat(test.countGoodStrings(3, 3, 1, 1)).isEqualTo(8);
        assertThat(test.countGoodStrings(2, 3, 1, 2)).isEqualTo(5);
    }
}
