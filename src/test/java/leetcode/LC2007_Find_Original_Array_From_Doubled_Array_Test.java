package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2007_Find_Original_Array_From_Doubled_Array_Test {
    LC2007_Find_Original_Array_From_Doubled_Array test = new LC2007_Find_Original_Array_From_Doubled_Array();

    @Test
    void exampleTest() {
        assertThat(test.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8})).isEqualTo(new int[]{1, 3, 4});
        assertThat(test.findOriginalArray(new int[]{6, 3, 0, 1})).isEqualTo(new int[]{});
        assertThat(test.findOriginalArray(new int[]{1})).isEqualTo(new int[]{});
    }
}
